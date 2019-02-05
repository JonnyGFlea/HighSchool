VERSION 5.00
Begin VB.Form Backdrop 
   BackColor       =   &H80000007&
   BorderStyle     =   0  'None
   Caption         =   "Form5"
   ClientHeight    =   14790
   ClientLeft      =   0
   ClientTop       =   0
   ClientWidth     =   18960
   LinkTopic       =   "Form5"
   ScaleHeight     =   14790
   ScaleWidth      =   18960
   ShowInTaskbar   =   0   'False
   StartUpPosition =   3  'Windows Default
   WindowState     =   2  'Maximized
   Begin VB.Timer Timer1 
      Interval        =   20
      Left            =   1200
      Top             =   11280
   End
   Begin VB.Image Image5 
      Height          =   2655
      Left            =   14880
      Picture         =   "Backdrop.frx":0000
      Stretch         =   -1  'True
      Top             =   11400
      Width           =   2175
   End
   Begin VB.Image Image4 
      Height          =   2640
      Left            =   14040
      Picture         =   "Backdrop.frx":03DD
      Stretch         =   -1  'True
      Top             =   2040
      Width           =   4260
   End
   Begin VB.Image dank 
      Height          =   2520
      Left            =   13440
      Picture         =   "Backdrop.frx":179F
      Top             =   6960
      Width           =   4500
   End
   Begin VB.Image donk 
      Height          =   2520
      Left            =   720
      Picture         =   "Backdrop.frx":3891
      Tag             =   "1"
      Top             =   7920
      Width           =   4500
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H80000007&
      Caption         =   "Created by Jonathan Rittmayer"
      BeginProperty Font 
         Name            =   "System"
         Size            =   19.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H8000000B&
      Height          =   4095
      Left            =   720
      TabIndex        =   0
      Top             =   5640
      Width           =   4455
   End
   Begin VB.Image Image3 
      Height          =   2520
      Left            =   480
      Picture         =   "Backdrop.frx":732D
      Stretch         =   -1  'True
      Top             =   1680
      Width           =   4800
   End
   Begin VB.Image Image2 
      Height          =   405
      Left            =   6600
      Picture         =   "Backdrop.frx":1684F
      Stretch         =   -1  'True
      Top             =   13560
      Width           =   5895
   End
   Begin VB.Image Image1 
      Height          =   405
      Left            =   6600
      Picture         =   "Backdrop.frx":17B4D
      Stretch         =   -1  'True
      Top             =   1680
      Width           =   5895
   End
End
Attribute VB_Name = "Backdrop"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Timer1_Timer()
If donk.Tag = 1 Then 'original pic
    donk.Picture = dank.Picture
    donk.Tag = 2
Else
    If donk.Tag = 2 Then
        dank.Picture = donk.Picture
        donk.Tag = 1
    End If
End If
End Sub
