USE [EduTec]
GO

/****** Object:  View [dbo].[V_MostarMatricula]    Script Date: 12/4/2017 9:02:26 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

create view [dbo].[V_MostarMatricula](codigoAlumno,alumno, docente, curso, fechaInicio, fechaFin) as
select alum.IdAlumno,(alum.ApeAlumno +', '+ alum.NomAlumno), 
(pro.ApeProfesor +', '+ pro.NomProfesor),
cur.NomCurso,ci.FecInicio,ci.FecTermino from
Alumno alum inner join Matricula mat on mat.IdAlumno = alum.IdAlumno 
inner join CursoProgramado curp on mat.IdCursoProg = curp.IdCursoProg 
inner join Profesor pro on curp.IdProfesor = pro.IdProfesor inner join 
Curso cur on cur.IdCurso = curp.IdCurso inner join
 Ciclo ci on ci.idCiclo = curp.IdCiclo
GO


