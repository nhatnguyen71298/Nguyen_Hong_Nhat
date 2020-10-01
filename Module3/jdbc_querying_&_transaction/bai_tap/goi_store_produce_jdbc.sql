DELIMITER $$

CREATE PROCEDURE display_all_user()

BEGIN

    select * from users;

    END $$

DELIMITER ;

DELIMITER $$

CREATE PROCEDURE edit_user(in id_edit int, in name_edit varchar(120), in  email_edit varchar(220), in  country_edit varchar(120) )

BEGIN

	update users
    set email =email_edit, `name`= name_edit , country=country_edit
    where id=id_edit;

    END $$

DELIMITER ;

DELIMITER $$

CREATE PROCEDURE delete_user(in id_delete int)

BEGIN

    delete from users
    where id=id_delete;

    END $$

DELIMITER ;