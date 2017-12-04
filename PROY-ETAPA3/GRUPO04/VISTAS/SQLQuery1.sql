USE [EduTec]
GO

/****** Object:  View [dbo].[Cursos_Programados]    Script Date: 12/4/2017 8:59:17 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

create view [dbo].[Cursos_Programados](
codigo,curso,ciclo,codigoPro,profesor,vacantes,matriculados,horario) as
select cr.idcursoProg,c.nomcurso,cr.idciclo,pro.idprofesor,(pro.apeProfesor + ' ' + pro.nomprofesor),cr.vacantes,cr.matriculados,cr.horario from
CursoProgramado cr inner join Curso c on cr.idCurso = c.idCurso inner join Profesor pro on cr.idProfesor = pro.IdProfesor
GO


