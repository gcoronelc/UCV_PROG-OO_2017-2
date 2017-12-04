
create view Alumno_View as
 select idAlumno,ApeAlumno,NomAlumno,DirAlumno,TelAlumno,EmailAlumno from dbo.Alumno
 go
 
 select * from Alumno_View
 select idAlumno from Alumno_View
