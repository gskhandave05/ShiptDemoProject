-- Customer dummy data
insert into customer values (1,1233445566,'gdf@bhg.com','John');
insert into customer values (2,9874563234,'bfd@wqe.com','Carl');
insert into customer values (3,5869375963,'thh@nhg.com','Vijay');
insert into customer values (4,7869329596,'wea@mjm.com','Stacy');
insert into customer values (5,6739576024,'dfd@mjk.com','Jude');
insert into customer values (6,1234567890,'asd@asd.com','Adam');

-- Products dummy data
insert into product values (201,150.0,150.0,'Oats',0,5,10.00);
insert into product values (202,120.0,120.0,'Flakes',0,3,12.00);
insert into product values (203,110.0,110.0,'Cookies',0,5,5.00);
insert into product values (204,100.0,100.0,'Bread',0,0,7.00);
insert into product values (205,50.00,50.00,'Tomato',0,7.5,1.50);
insert into product values (206,105.0,105.0,'Notebook',0,0,8.00);
insert into product values (207,15.0,15.0,'Laptop',0,0,350.00);
insert into product values (208,115.0,115.0,'Speaker',0,3,120.00);
insert into product values (209,154.0,154.0,'Jacket',0,2,60.00);
insert into product values (210,190.0,190.0,'TShirt',0,2,20.00);
insert into product values (211,13.0,13.0,'Rose Bouquet',0,10,32.00);
insert into product values (212,16.0,16.0,'Chocolate Bouquet',0,7,70.00);


-- Product category data
insert into product_category values (301,'Food');
insert into product_category values (302,'Electronics');
insert into product_category values (303,'Stationary');
insert into product_category values (304,'Clothes');
insert into product_category values (305,'Vegetables');
insert into product_category values (306,'Bouquet');

-- Product Category Product data
insert into  PRODUCT_CATEGORY_PRODUCT values (201,301);
insert into  PRODUCT_CATEGORY_PRODUCT values (202,301);
insert into  PRODUCT_CATEGORY_PRODUCT values (203,301);
insert into  PRODUCT_CATEGORY_PRODUCT values (204,301);
insert into  PRODUCT_CATEGORY_PRODUCT values (205,301);
insert into  PRODUCT_CATEGORY_PRODUCT values (205,305);
insert into  PRODUCT_CATEGORY_PRODUCT values (206,303);
insert into  PRODUCT_CATEGORY_PRODUCT values (207,302);
insert into  PRODUCT_CATEGORY_PRODUCT values (208,302);
insert into  PRODUCT_CATEGORY_PRODUCT values (209,304);
insert into  PRODUCT_CATEGORY_PRODUCT values (210,304);
insert into  PRODUCT_CATEGORY_PRODUCT values (211,306);
insert into  PRODUCT_CATEGORY_PRODUCT values (212,306);

-- Orders data cascaded
-- 1
insert into orders values (401,'Leave at door',3,'WAITING_FOR_DELIVERY',25.75,'2019-02-11'); 
insert into order_line values (501,20.00,2,201);
insert into order_line values (502,12.00,1,202);
insert into order_line values (503,3.75,2.5,205);
insert into orders_order_line values (401,501);
insert into orders_order_line values (401,502);
insert into orders_order_line values (401,503);
insert into orders_customer values (401,2);

-- 2
insert into orders values (402,'',1,'ON_ITS_WAY',60.00,'2019-04-11'); 
insert into order_line values (504,60.00,1,209);
insert into orders_order_line values (402,504);
insert into orders_customer values (402,4);

-- 3
insert into orders values (403,'Ring the bell',2,'DELIVERED',746.00,'2019-02-14'); 
insert into order_line values (505,256.00,8,211);
insert into order_line values (506,490.00,7,212);
insert into orders_order_line values (403,505);
insert into orders_order_line values (403,506);
insert into orders_customer values (403,1);

-- 4
insert into orders values (404,'',2,'ON_ITS_WAY',45.00,'2019-03-07'); 
insert into order_line values (507,30.00,3,201);
insert into order_line values (508,15.00,5,203);
insert into orders_order_line values (404,507);
insert into orders_order_line values (404,508);
insert into orders_customer values (404,5);

-- 5
insert into orders values (405,'',2,'WAITING_FOR_DELIVERY',26.25,'2019-03-08'); 
insert into order_line values (509,24.00,2,202);
insert into order_line values (510,2.25,1.5,205);
insert into orders_order_line values (405,509);
insert into orders_order_line values (405,510);
insert into orders_customer values (405,6);

-- 6
insert into orders values (406,'',2,'DELIVERED',392.00,'2019-03-10'); 
insert into order_line values (511,32.00,1,211);
insert into order_line values (512,360.00,3,208);
insert into orders_order_line values (406,511);
insert into orders_order_line values (406,512);
insert into orders_customer values (406,2);

-- 7
insert into orders values (407,'',2,'ON_ITS_WAY',45.25,'2018-01-14'); 
insert into order_line values (513,40.00,2,210);
insert into order_line values (514,5.25,3.5,205);
insert into orders_order_line values (407,513);
insert into orders_order_line values (407,514);
insert into orders_customer values (407,4);

-- 8
insert into orders values (408,'',2,'DELIVERED',92.00,'2017-04-11'); 
insert into order_line values (515,60.00,1,209);
insert into order_line values (516,32.00,1,211);
insert into orders_order_line values (408,515);
insert into orders_order_line values (408,516);
insert into orders_customer values (408,5);