VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H80000002&
   BorderStyle     =   5  'Sizable ToolWindow
   Caption         =   "Jonathan Rittmayer"
   ClientHeight    =   7635
   ClientLeft      =   4440
   ClientTop       =   3525
   ClientWidth     =   9780
   BeginProperty Font 
      Name            =   "Comic Sans MS"
      Size            =   8.25
      Charset         =   0
      Weight          =   400
      Underline       =   0   'False
      Italic          =   0   'False
      Strikethrough   =   0   'False
   EndProperty
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   7635
   ScaleWidth      =   9780
   ShowInTaskbar   =   0   'False
   Begin VB.CommandButton Command1 
      BackColor       =   &H80000004&
      Caption         =   "Click Me"
      BeginProperty Font 
         Name            =   "Comic Sans MS"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   3480
      MaskColor       =   &H00FF00FF&
      TabIndex        =   0
      Top             =   5760
      Width           =   3015
   End
   Begin VB.Label Label1 
      BackColor       =   &H80000004&
      Caption         =   "Hello World"
      BeginProperty Font 
         Name            =   "System"
         Size            =   48.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1095
      Left            =   2280
      TabIndex        =   1
      Top             =   480
      Width           =   5775
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
If Label1.Visible = True Then

    Label1.Visible = False
    Label1.BackColor = (&HC0FFC0)
Else 'get here when  cannot see label1
    Label1.Visible = True
    Label1.BackColor = (&HC0FFC1)
End If
   
End Sub

