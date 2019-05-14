CREATE DATABASE ThucTap;
USE ThucTap;
CREATE TABLE TBLKhoa(
	Makhoa char(10)primary key,
	Tenkhoa char(30),
	Dienthoai char(10)
);
CREATE TABLE TBLGiangVien(
	Magv int primary key,
	Hotengv char(30),
	Luong decimal(5,2),
	Makhoa char(10) references TBLKhoa
);
CREATE TABLE TBLSinhVien(
	Masv int primary key,
	Hotensv char(40),
	Makhoa char(10) ,
	Namsinh int,
	Quequan char(30),
	foreign key (Makhoa) references TBLKhoa(Makhoa)
);
CREATE TABLE TBLDeTai(
	Madt char(10)primary key,
	Tendt char(30),
	Kinhphi int,
	Noithuctap char(30)
);
CREATE TABLE TBLHuongDan(
	Masv int primary key,
	Madt char(10),
	Magv int ,
	KetQua decimal(5,2),
	foreign key (Madt) references TBLDeTai(Madt),
	foreign key (Magv) references TBLGiangVien(Magv)
);
INSERT INTO TBLKhoa VALUES
('Geo','Dia ly va QLTN',3855413),
('Math','Toan',3855411),
('Bio','Cong nghe Sinh hoc',3855412);
INSERT INTO TBLGiangVien VALUES
(11,'Thanh Binh',700,'Geo'),     
(12,'Thu Huong',500,'Math'),
(13,'Chu Vinh',650,'Geo'),
(14,'Le Thi Ly',500,'Bio'),
(15,'Tran Son',900,'Math');
INSERT INTO TBLSinhVien VALUES
(1,'Le Van Son','Bio',1990,'Nghe An'),
(2,'Nguyen Thi Mai','Geo',1990,'Thanh Hoa'),
(3,'Bui Xuan Duc','Math',1992,'Ha Noi'),
(4,'Nguyen Van Tung','Bio',null,'Ha Tinh'),
(5,'Le Khanh Linh','Bio',1989,'Ha Nam'),
(6,'Tran Khac Trong','Geo',1991,'Thanh Hoa'),
(7,'Le Thi Van','Math',null,'null'),
(8,'Hoang Van Duc','Bio',1992,'Nghe An');
INSERT INTO TBLDeTai VALUES
('Dt01','GIS',100,'Nghe An'),
('Dt02','ARC GIS',500,'Nam Dinh'),
('Dt03','Spatial DB',100, 'Ha Tinh'),
('Dt04','MAP',300,'Quang Binh' );
INSERT INTO TBLHuongDan VALUES
(1,'Dt01',13,8),
(2,'Dt03',14,0),
(3,'Dt03',12,10),
(5,'Dt04',14,7),
(6,'Dt01',13,Null),
(7,'Dt04',11,10),
(8,'Dt03',15,6);






#1. Dua ra thông tin gom mã so, ho tênvà tên khoa cua tat ca các giang viên
select GV.magv,GV.hotengv,K.tenkhoa From TblGiangvien GV
join tblkhoa as K on GV.Makhoa = k.Makhoa;

#2. Dua ra thông tin gom mã so, ho tênvà tên khoa cua các giang viên cua khoa ‘DIA LY va QLTN’

select GV.magv,GV.hotengv,K.tenkhoa From TblGiangvien GV
join tblkhoa as K on GV.Makhoa = k.Makhoa
where k.tenkhoa = 'Dia Ly va QLTN';

#3 Cho biết số sinh viên của khoa ‘CONG NGHE SINH HOC’
select count(*) From TBLSinhVien as Sv
join tblKhoa as K on k.makhoa = sv.makhoa
where k.tenkhoa = 'Cong nghe sinh hoc';

#4. Đưa ra danh sách gồm mã số, họ tênvà tuổi của các sinh viên khoa ‘TOAN’

select sv.masv,sv.hotensv,sv.namsinh From TBLSinhVien as Sv
join tblKhoa as K on k.makhoa = sv.makhoa
where k.tenkhoa = 'Toan';

#5. Cho biết số giảng viên của khoa ‘CONG NGHE SINH HOC’
select count(*) From tblGiangvien as gv
join tblKhoa as K on k.makhoa = gv.makhoa
where k.tenkhoa = 'Cong nghe sinh hoc';

#6. Cho biết thông tin về sinh viên không tham gia thực tập
SELECT SV.Masv,SV.Hotensv FROM TBLSinhVien SV 
WHERE NOT EXISTS( SELECT HD.Masv FROM TBLHuongDan HD  WHERE SV.Masv = HD.Masv);

#7. Đưa ra mã khoa, tên khoa và số giảng viên của mỗi khoa

select K.makhoa,k.tenkhoa,count(k.Makhoa) From tblKhoa K
join tblgiangvien as gv on k.makhoa = gv.makhoa
Group By k.makhoa,k.tenkhoa;


#8. Cho biet so đien thoai cua khoa mà sinh viên có tên ‘Le van son’ đang theo hoc
select K.dienthoai From TBLKhoa as K
join tblSinhvien as sv on sv.makhoa = k.makhoa
where sv.hotensv = 'Le van son';

#9. Cho biet mã so và tên cua các đe tài do giang viên ‘Tran son’ huong dan
select dt.madt,dt.tendt from tblGiangvien as gv
join tblhuongdan as HD on hd.magv = gv.magv
join tbldetai as dt on dt.madt = hd.madt
where gv.hotengv = "Tran son";


#10. Cho biet tên đe tài không có sinh viên nào thuc tap
SELECT DT.Madt,DT.Tendt FROM TBLDeTai DT
WHERE NOT EXISTS( SELECT HD.Madt FROM TBLHuongDan HD WHERE HD.Madt = DT.Madt);

#11. Cho biet mã so, ho tên, tên khoa cua các giang viên huong dan tu 3 sinh viên tro lên.
Select gv.magv ,gv.hotengv, k.tenkhoa From TblGiangvien as gv
join tblkhoa as k on k.makhoa = gv.makhoa
join tblHuongdan as HD on HD.magv = gv.magv
where m;


SELECT GV.Magv,GV.Hotengv,K.Tenkhoa FROM TBLGiangVien GV 
JOIN TBLKhoa K ON GV.Makhoa = K.Makhoa
WHERE GV.Magv IN ( SELECT HD.Magv FROM TBLHuongDan HD GROUP BY HD.Magv HAVING COUNT(HD.Magv)>=2);














