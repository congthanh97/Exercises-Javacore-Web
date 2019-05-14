drop database if exists Dangky;
Create database Dangky;
use Dangky;
drop table if exists Nhacungcap;
create table Nhacungcap(
	MaNhaCC varchar(500) not null,
	TenNhaCC varchar(500) default null,
	Diachi varchar(1000) default null,
	SoDT char(15) default null,
	MaSoThue  char(30) default null,
	Constraint primary key (MaNhaCC)
	
);



drop table if exists LoaiDichVu;
create table LoaiDichVu(
	MaLoaiDV varchar(50) not null,
	TenLoaiDV varchar(100) not null,
	constraint primary key (MaLoaiDV)
);


drop table if exists MucPhi;
create table MucPhi(
	MaMP varchar(50) not null,
	Dongia int not null,
	Mota nvarchar(1000),
	constraint primary key(MaMP)
);


drop table if exists DongXe;
create table DongXe(
	Dongxe varchar(100) not null,
	Hangxe varchar(100) not null,
	SoChoNgoi int,
	constraint primary key(Dongxe)

);



drop table if exists DangKyCungCap;
create table DangKyCungCap(
	MaDKCC varchar(100) not null,
	MaNhaCC varchar(500) not null,
	MaLoaiDV varchar(50) not null,
	Dongxe varchar(100) not null,
	MaMP varchar(50) not null,
	NgaybatdauCC datetime,
	NgayKetThucCC datetime,
	SoluongXeDK int,
	Constraint DangkyCC_Madk_ManhaCC_Maloai_Donxe_MaMp_pk primary key(MaDKCC,MaNhaCC,MaloaiDV,Dongxe,MaMP),
	Constraint Nhacungcap_ManhaCC foreign key (MaNhaCC) references Nhacungcap(MaNhaCC) on delete cascade,
	Constraint LoaiDV_MaloaiDV foreign key (MaLoaiDV) references LoaiDichVu(MaLoaiDV) on delete cascade,
	Constraint Dongxe_Dongxe foreign key (Dongxe) references DongXe(Dongxe) on delete cascade,
	Constraint Mucphi_MaMP foreign key (MaMP) references MucPhi(MaMP) on delete cascade
);
create table DangKyCungCap(
	MaDKCC varchar(100) not null ,
	MaNhaCC varchar(500) not null,
	MaLoaiDV varchar(50) not null,
	Dongxe varchar(100) not null,
	MaMP varchar(50) not null,
	NgaybatdauCC datetime,
	NgayKetThucCC datetime,
	SoluongXeDK int,
	primary key(MaDKCC,MaNhaCC,MaLoaiDV,Dongxe,MaMP)
);
INSERT INTO Dangkycungcap (MaDKCC) value ('DVC111');

# insert into vao bao Nhacungcap
INSERT INTO Nhacungcap(MaNhaCC,TenNhaCC,DiaChi,SoDT,MaSoThue) value
('NCC001','Cty TNHH Toan Phap','Ha noi'     ,05113999123,568941),
('NCC002','Cty TNHH Toan Phap','TPHCM'      ,05113999124,568942),
('NCC003','Cty TNHH Toan Phap','Ha noi'     ,05113999125,568943),
('NCC004','Cty TNHH Toan Phap','Tuyen Quang',05113999126,568944),
('NCC005','Cty TNHH Toan Phap','Thanh Hoa'  ,05113999127,568945),
('NCC006','Cty TNHH Toan Phap','Ha noi'     ,05113999128,568946),
('NCC007','Cty TNHH Toan Phap','Ha noi'     ,05113999129,568947),
('NCC008','Cty TNHH Toan Phap','Hai Phong'  ,05113999131,568948),
('NCC009','Cty TNHH Toan Phap','Quang Nam'  ,05113999132,568949),
('NCC0010','Cty TNHH Toan Phap','Ninh Binh' ,05113999133,568940);

INSERT INTO LoaiDichVu(MaloaiDV,TenLoaiDV)value
('DV01','Dich vu xe taxj'),
('DV02','Dich vu xe buyt cong cong theo tuyen co dinh'),
('DV03','Dich vu xe cho thue theo hop dong');

INSERT INTO MUCPHI(MaMP,DonGia,Mota)value
('MP01',10,'Ap dung tu ngay 1/2015'),
('MP02',15,'Ap dung tu ngay 2/2015'),
('MP03',20,'Ap dung tu ngay 1/2010'),
('MP04',25,'Ap dung tu ngay 2/2011');

INSERT INTO Dongxe(Dongxe,Hangxe,SoChoNgoi)value
('Hiace','Toyota',16),
('Vios','Toyota',16),
('Escape','Toyota',16),
('Cerato','KIA',16),
('Forte','KIA',16),
('starex','Huyndai',16),
('Grabd-i10','Huyndai',16);




/* 

	INSERT INTO DangKyCungCap(MaDKCC,MaNhaCC,MaLoaiDV,DongXe,MaMP,NgayBatDauCC,NgayKetThucCC,SoluongXeDK)value
('DK001','NCC001','DV01','Hiace','MP01',STR_TO_DATE('1/08/2019', '%d/%m/%Y'),STR_TO_DATE('31/08/2022', '%d/%m/%Y'),16);


*/



INSERT INTO DangKyCungCap(MaDKCC,MaNhaCC,MaLoaiDV,DongXe,MaMP,NgayBatDauCC,NgayKetThucCC,SoluongXeDK)value
('DK001','NCCOO1','DV01','hiace','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK002','NCCOO2','DV02','Hiace','MP02',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK003','NCCOO3','DV03','Escape','MP02',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK004','NCCOO4','DV01','forte','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK005','NCCOO2','DV02','hiace','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK006','NCCOO4','DV03','Starex','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK007','NCCOO5','DV01','Escape','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK008','NCCOO6','DV01','hiace','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK009','NCCOO5','DV03','vios','MP04',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0010','NCCOO6','DV01','Forte','MP03',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0011','NCCOO7','DV01','hiace','MP02',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0012','NCCOO7','DV03','vios','MP04',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0013','NCCOO3','DV02','Grand-i10','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0014','NCCOO8','DV02','hiace','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0015','NCCOO3','DV01','Toyota','MP02',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0016','NCCOO1','DV03','vios','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0017','NCCOO2','DV03','hiace','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0018','NCCOO8','DV03','Grand-i10','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0019','NCCOO3','DV03','Starex','MP02',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0020','NCCOO2','DV03','hiace','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0021','NCCOO6','DV01','Toyota','MP02',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0022','NCCOO2','DV02','forte','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0023','NCCOO2','DV01','forte','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0024','NCCOO3','DV03','Escape','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4),
('DK0025','NCCOO4','DV03','hiace','MP01',STR_TO_DATE('5/08/2019', '%d/%m/%Y'),STR_TO_DATE('5/08/2022', '%d/%m/%Y'),4)
;


#1Liet ke xe nhung dong se co cho ngoi tren 5
select sochongoi from Dongxe where sochongoi >5;


#2 liet ke thong tin cua cac nhac cung cap da tung dang ky cung cap nhun dong xe thuoc hang xe 'toyota' voi muc phi don gia 
# la 15 VND/km hoac nhung dong xe thuoc  hang xe 'KIA' voi muc phi don gia 20VND/km
select ncc.TenNhaCC,ncc.MaNhaCC From DangKyCungCap as dk
join Nhacungcap as ncc on ncc.MaNhaCC = dk.MaNhaCC
join Mucphi as mp on mp.MaMP =  dk.MaMP
join Dongxe as dx on dx.DongXe = dk.DongXe
where dx.HangXe = 'toyota' and mp.DonGia = 15 or dx.HangXe = 'Kia' and mp.DonGia = 20 ;


SELECT NCC.MaNhaCC, NCC.TenNhaCC FROM NHACUNGCAP NCC 
JOIN DANGKYCUNGCAP DK ON NCC.MaNhaCC = DK.MaNhaCC
JOIN MUCPHI MP ON MP.MaMp = DK.MaMp
JOIN DONGXE DX ON DX.DongXe = DK.DongXe
WHERE (DX.HangXe = 'Toyota' and MP.DonGia = 15) or (DX.HangXe = 'KIA' and MP.DonGia = 20)
 












