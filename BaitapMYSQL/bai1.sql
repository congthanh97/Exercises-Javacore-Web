drop database if exists QuanlyThuvien;
Create database QuanlyThuvien;
use Quanlythuvien;

drop table if exists SACH;
create table SACH ( 
	masach int not null primary key auto_increment,
	ten nvarchar(500) not null, 
	tacgia nvarchar(500) not null, 
	nxb nvarchar(500), 
	soluong int(100)
);

drop table if exists DOCGIA;
create table DOCGIA (
	sothe int not null primary key auto_increment,
	ten nvarchar(500) not null,
	khoa nvarchar(500) not null,
	khoahoc nvarchar(500),
	thoihanthe datetime
);

drop table if exists PHIEUMUON;
create table PHIEUMUON (
	masach int not null,
	sothe int not null,
	ngaymuon datetime,
	ngaytra datetime,
	ghichu nvarchar(1000),
	primary key (masach, sothe),
	foreign key (masach) references SACH(masach) on delete cascade,
	foreign key (sothe) references DOCGIA(sothe) on delete cascade
);

#SACH ( masach, ten, tacgia, nxb, soluong )
Insert into SACH(ten, tacgia,nxb,soluong)value
('Toan','Nguyen dinh tri','nxb giao duc',10),
('Van','Nguyen dinh chieu','nxb giao duc',10),
('Hoa','Nguyen thi hoa','nxb giao duc',10),
('ly','Bui van cong','nxb giao duc',10),
('Su','Nguyen dinh','nxb giao duc',10);

#DOCGIA ( sothe, ten, khoa, khoahoc, thoihanthe )
Insert into DOCGIA(ten,khoa,khoahoc,thoihanthe)value
('Nguyen Van Anh', 'An toan', 'AT13', STR_TO_DATE('5/08/2019', '%d/%m/%Y')PRIMARY),
('Nguyen Thi Dao', 'An toan', 'AT13', STR_TO_DATE('9/08/2019', '%d/%m/%Y')),
('Hoang Van Hieu', 'An toan', 'AT13', STR_TO_DATE('10/08/2019', '%d/%m/%Y')),
('Bui Van Cong'  , 'An toan', 'AT13', STR_TO_DATE('20/08/2019', '%d/%m/%Y')),
('Dao Ngoc Thanh', 'An toan', 'AT13', STR_TO_DATE('31/08/2019', '%d/%m/%Y'));


insert into PHIEUMUON(masach, sothe, ngaymuon) values
(1, 5, STR_TO_DATE('24/08/2019', '%d/%m/%Y')),
(2, 4, STR_TO_DATE('24/08/2019', '%d/%m/%Y')),
(3, 4, STR_TO_DATE('24/08/2019', '%d/%m/%Y')),
(4, 3, STR_TO_DATE('24/08/2019', '%d/%m/%Y')),
(5, 1, STR_TO_DATE('24/08/2019', '%d/%m/%Y'));

#update ngay tra
update PHIEUMUON set ngaytra = STR_TO_DATE('24/09/2019', '%d/%m/%Y') where masach = 1 and sothe = 5;
update PHIEUMUON set ngaytra = STR_TO_DATE('12/09/2019', '%d/%m/%Y') where masach = 2 and sothe = 4;
update PHIEUMUON set ngaytra = STR_TO_DATE('10/09/2019', '%d/%m/%Y') where masach = 3 and sothe = 4;

#delete  du lieu bang phieu muon vosi masach muon va sothe

delete from PHIEUMUON where masach = 52 and sothe = 4;

#cau 5 hien thi sothe,ten,khoa from docgia sap xep theo sothe
select sothe,ten,khoa FROM DOCGIA order by sothe asc;

#cau6 tim nhung doc gia muon toan vao ngay 27/8/2019
#SACH ( masach, ten, tacgia, nxb, soluong )
#DOCGIA ( sothe, ten, khoa, khoahoc, thoihanthe )
#PHIEUMUON ( masach, sothe, ngaymuon, ngaytra, ghichu )
#c1 su dung kieu and 
select DOCGIA.ten from PHIEUMUON, SACH, DOCGIA
where SACH.masach =  PHIEUMUON.masach and DOCGIA.sothe =  PHIEUMUON.sothe and SACH.ten ='Van' 
and PHIEUMUON.ngaymuon = STR_TO_DATE('24/08/2019', '%d/%m/%Y');

#c2 su dung join ket hop hai bang doc gia voi phieu muon and sach voi phieu muon
select DG.ten from PHIEUMUON as PM
join DOCGIA as DG on pm.sothe =  dg.sothe
join SACH   as s  on s.masach = PM.masach
where s.ten = 'toan' and PM.ngaymuon =  STR_TO_DATE('24/08/2019', '%d/%m/%Y');


#Cau 7Hien thi tên, so the, tên sách cua tat ca đoc gia muon sách trong tháng 8/2019
select DG.ten, DG.sothe, s.ten from PHIEUMUON as PM
join DOCGIA as DG on pm.sothe =  dg.sothe
join SACH   as s  on s.masach = pm.masach
where PM.ngaymuon between STR_TO_DATE('1/08/2019', '%d/%m/%Y') and STR_TO_DATE('31/08/2019', '%d/%m/%Y');

#Cau 8 Danh sách các sách không ai muon
select s.ten from SACH as s
where s.masach not in (select distinct masach from PHIEUMUON);

#9 cho biet doc gia ten anh muong sach bao nhieu lan
select count(*) as 'so lan ' from PHIEUMUON as PM
join DOCGIA as DG on DG.sothe =  PM.sothe
join SACH as s on s.masach = PM.masach
where DG.ten = 'Bui van cong';


#10Danh sách tên, so the, các đoc gia chua tra sách

select DG.ten ,pm.sothe from phieumuon as PM
join DOCGIA as DG on dg.sothe =  PM.sothe
join SACH as s on s.masach = PM.masach
where PM.ngaytra is null















