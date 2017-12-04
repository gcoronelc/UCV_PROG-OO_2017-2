USE [EduTec]
GO

/****** Object:  View [dbo].[V_Curso]    Script Date: 12/4/2017 9:01:29 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

create view [dbo].[V_Curso] (codigo, tarifa, nombre)as
select idcurso, idtarifa, nomcurso from Curso
GO


