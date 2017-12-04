USE [EduTec]
GO

/****** Object:  View [dbo].[V_askfjadsf]    Script Date: 12/4/2017 9:04:26 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

create view [dbo].[V_askfjadsf](curso,idcursoprogramdo) as
select cur.NomCurso, curp.IdCursoProg from Curso cur inner join CursoProgramado curp on cur.IdCurso = curp.IdCurso
GO


