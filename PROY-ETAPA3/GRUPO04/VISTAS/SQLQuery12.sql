USE [EduTec]
GO

/****** Object:  View [dbo].[V_Tarifa]    Script Date: 12/4/2017 9:03:18 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

create view [dbo].[V_Tarifa] ( codigo, precio, descripcion, horas, pagohora) as
select idtarifa, precioventa, descripcion, horas, pagoHora from Tarifa
GO


