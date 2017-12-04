

create view Profesor_View as
 select idProfesor,ApeProfesor,NomProfesor,TelProfesor, DirProfesor from dbo.Profesor
 go
 
 select * from Profesor_View
 select idProfesor from Profesor_View
