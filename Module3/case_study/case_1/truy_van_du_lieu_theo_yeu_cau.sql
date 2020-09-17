-- 2. tên nhân viên bắt đầu = h,t,k ít hơn 30 kí tự
select *
from nhan_vien
where ho_va_ten regexp binary '\\s[HTK][:alpha:]+$' and length(ho_va_ten)<=30;

-- 3. KH 18-50 ở đà nẵng hoặc quảng trị
select *
from khach_hang 
where (year(curdate())-year(birthday) between 18 and 50 ) and (dia_chi='đà nẵng'or dia_chi='quảng trị');
-- 4. đếm xem KH đã đặt phòng bao nhiêu lần chỉ đếm KH diamond và sắp xếp tăng dần theo số lần đặt;
select k.ho_va_ten,count(h.id_khach_hang)
from khach_hang k
join  hop_dong h on k.id_khach_hang =h.id_khach_hang
group by k.ho_va_ten,k.id_loai_khach
having k.id_loai_khach=1
order by count(k.id_khach_hang);
-- 5. hiển thị thông tin KH với tổng tiền-- 
select k.ho_va_ten, hd.id_hop_dong, lk.ten_loai_khach, hd.ngay_lam_hop_dong, hd.ngay_ket_thuc, sum(dv.chi_phi_thue + dvdk.gia * hdct.so_luong) as 'Tổng tiền' 
from khach_hang k
left join hop_dong hd on k.id_khach_hang = hd.id_khach_hang
left join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
left join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong_chi_tiet
left join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem= dvdk.id_dich_vu_di_kem
left join loai_khach lk on k.id_loai_khach =lk.id_loai_khach
group by k.id_khach_hang
order by hd.id_hop_dong;
-- 6. hiển thị id dịch vụ, tên dịch vụ, diện tích, chi phí thuê, của tất cả dịch vụ không đặt từ quí 1 năm 2019
select dv.id_dich_vu,ldv.ten_loai_dich_vu, dv.ten_dich_vu, dv.dien_tich, dv.chi_phi_thue, hd.ngay_lam_hop_dong
from dich_vu dv
left join loai_dich_vu ldv on dv.id_loai_dich_vu= ldv.id_loai_dich_vu
join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
where not ((month(hd.ngay_lam_hop_dong) between 1 and 3) and year(hd.ngay_lam_hop_dong)=2019);
-- 7. hiển thị id dịch vụ, tên dịch vụ, diện tích,số người tối đa, chi phí thuê, tên loại của tất cả dịch vụ đặt trong năm 2018 nhưng chưa được đặt trong 2019
select dv.id_dich_vu, ldv.ten_loai_dich_vu, dv.dien_tich, dv.so_nguoi_toi_da, dv.chi_phi_thue,hd.ngay_lam_hop_dong
from dich_vu dv
join loai_dich_vu ldv on dv.id_loai_dich_vu= ldv.id_loai_dich_vu
join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
where year(hd.ngay_lam_hop_dong)=2018 and dv.id_dich_vu not in (
select dv.id_dich_vu
from dich_vu dv
join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
where year(hd.ngay_lam_hop_dong)=2019);
-- 8 3 cách in ra tên KH ko trùng nhau
select distinct ho_va_ten
from khach_hang;
select ho_va_ten
from khach_hang
group by ho_va_ten;
select ho_va_ten
from khach_hang
union
select ho_va_ten
from khach_hang;
-- 9. thống kê doanh thu theo tháng trong năm 2019
select count(hd.ngay_lam_hop_dong),month(hd.ngay_lam_hop_dong),hd.tong_tien
from hop_dong hd
where year(hd.ngay_lam_hop_dong)=2019
group by month(hd.ngay_lam_hop_dong);
-- 10. hien thi id hop dong, ngày làm hợp đồng, ngay ket thuc,tien datcoc,so luong dich vu di kem
select hd.id_hop_dong, hd.ngay_lam_hop_dong,hd.ngay_ket_thuc,hd.tien_dat_coc, hdct.so_luong so_luong_dich_vu_di_kem
from hop_dong hd
left join hop_dong_chi_tiet hdct on hd.id_hop_dong=hdct.id_hop_dong
group by hd.id_hop_dong;
-- 11. hien thi cac dich vu đi kèm từ khách hàng diamond có địa chỉ từ quảng ngãi hoặc vinh
select kh.ho_va_ten, kh.dia_chi,kh.id_loai_khach, dvdk.*
from hop_dong hd
left join khach_hang kh on hd.id_khach_hang= kh.id_khach_hang
left join hop_dong_chi_tiet hdct on hd.id_hop_dong=hdct.id_hop_dong
left join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem= dvdk.id_dich_vu_di_kem
where kh.id_loai_khach=1 and (kh.dia_chi='vinh' or kh.dia_chi= 'quảng ngãi')