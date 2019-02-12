VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H0080C0FF&
   Caption         =   "BEST GAME EVA"
   ClientHeight    =   11325
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   13605
   LinkTopic       =   "Form1"
   ScaleHeight     =   11325
   ScaleWidth      =   13605
   StartUpPosition =   3  'Windows Default
   Begin VB.Timer gametimer 
      Interval        =   1200
      Left            =   7920
      Top             =   6240
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Start"
      BeginProperty Font 
         Name            =   "Poor Richard"
         Size            =   48
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   2655
      Left            =   4680
      TabIndex        =   0
      Top             =   4080
      Width           =   3735
   End
   Begin VB.Label Label2 
      BackColor       =   &H0080C0FF&
      Caption         =   "0"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00000000&
      Height          =   720
      Left            =   9720
      TabIndex        =   2
      Top             =   290
      Width           =   1215
   End
   Begin VB.Label Label1 
      BackColor       =   &H0080C0FF&
      Caption         =   "Score:"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   8160
      TabIndex        =   1
      Top             =   240
      Width           =   1695
   End
   Begin VB.Image Image3 
      Height          =   810
      Left            =   2280
      Picture         =   "Finalexam.frx":0000
      Stretch         =   -1  'True
      Top             =   120
      Width           =   960
   End
   Begin VB.Image Image2 
      Height          =   810
      Left            =   1200
      Picture         =   "Finalexam.frx":018A
      Stretch         =   -1  'True
      Top             =   120
      Width           =   960
   End
   Begin VB.Image Image1 
      Height          =   810
      Left            =   120
      Picture         =   "Finalexam.frx":0314
      Stretch         =   -1  'True
      Top             =   120
      Width           =   960
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()

Command1.Visible = False
gametimer.Enabled = True
Randomize Timer
num = Int(Rnd * 2 + 1)

If num = 0 Then
Image1.Visible = True
End If

If num = 1 Then
Image1.Visible = True
End If

If num = 2 Then
Image1.Visible = True
End If

End Sub

Private Sub Form_Load()
Command1.Visible = True
Image1.Visible = False
Image2.Visible = False
Image3.Visible = False

Image1.Top = 120
Image1.Left = 120
Image2.Top = 120
Image2.Left = 1200
Image3.Top = 120
Image2.Left = 2280
End Sub

Private Sub gametimer_Timer()
Image1.Left = Image1.Left + 50
Image2.Left = Image2.Left + 50
Image3.Left = Image3.Left + 50

Image1.Top = Image1.Top + 50
Image2.Top = Image2.Top + 50
Image3.Top = Image3.Top + 50
End Sub

Private Sub Image1_Click()
gametimer.Enabled = False
answer = MsgBox("You Got Me!")
Label2.Caption = Label2 + 1
Call Form_Load
End Sub

Private Sub Image2_Click()
gametimer.Enabled = False
answer = MsgBox("You Got Me!")
Label2.Caption = Label2 + 1
Call Form_Load
End Sub

Private Sub Image3_Click()
gametimer.Enabled = False
answer = MsgBox("You Got Me!")

Call Form_Load
End Sub

