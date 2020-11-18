package com.gym.case_study.entity;

import com.gym.case_study.entity.contract.Contract;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "service_id")
    private Integer id;
    private String name;
    @Pattern(regexp = "^\\d+$",message = "Input a number")
    private String area;
    @Pattern(regexp = "^\\d+$",message = "Input a number")
    private String cost;
    @Pattern(regexp = "^\\d+$",message = "Input a number")
    private String maxPeople;
    private String typeRent;
    private String typeService;
    private String standardRoom;
    private String orther;
    @Pattern(regexp = "^\\d+$",message = "Input a number")
    private String poolArea;
    @Pattern(regexp = "^\\d+$",message = "Input a number")
    private String numberFloor;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    List<Contract> contractList;

    public Service() {
    }

    public Service(String name,String area,String cost,String maxPeople, String typeRent, String typeService, String standardRoom, String orther, String poolArea,String numberFloor) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
        this.typeService = typeService;
        this.standardRoom = standardRoom;
        this.orther = orther;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOrther() {
        return orther;
    }

    public void setOrther(String orther) {
        this.orther = orther;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(String numberFloor) {
        this.numberFloor = numberFloor;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
