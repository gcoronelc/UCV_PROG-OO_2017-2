USE [EduTec]
GO

/****** Object:  View [dbo].[V_Ciclo]    Script Date: 12/4/2017 9:01:08 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

create view [dbo].[V_Ciclo](ciclo, fechainicio, fechafinal) as
select all * from Ciclo
GO


