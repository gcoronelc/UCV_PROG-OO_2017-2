USE [EduTec]
GO

/****** Object:  View [dbo].[V_Matricula]    Script Date: 12/4/2017 9:02:07 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

create view [dbo].[V_Matricula](codigoprofesor,codigoalumno,fechamatricula,examenparcial,examenfinal,promedio,subsanacion,examensub) as
select all * from Matricula
GO


