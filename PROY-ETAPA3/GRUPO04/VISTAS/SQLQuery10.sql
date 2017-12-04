USE [EduTec]
GO

/****** Object:  View [dbo].[V_Profesor]    Script Date: 12/4/2017 9:02:53 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

create view [dbo].[V_Profesor](codigo, profesor, direccion,telefono,email) as
select idProfesor, (NomProfesor + ApeProfesor), DirProfesor, TelProfesor, EmailProfesor from Profesor
GO


