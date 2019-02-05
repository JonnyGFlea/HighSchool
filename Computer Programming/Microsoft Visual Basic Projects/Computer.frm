VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H80000002&
   Caption         =   "Form1"
   ClientHeight    =   4215
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   6780
   FillColor       =   &H00C0C0FF&
   LinkTopic       =   "Form1"
   ScaleHeight     =   4215
   ScaleWidth      =   6780
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text1 
      Height          =   615
      Left            =   1080
      TabIndex        =   4
      Top             =   1320
      Width           =   1695
   End
   Begin VB.OptionButton Option2 
      BackColor       =   &H80000002&
      Caption         =   "Subtraction"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   4800
      TabIndex        =   3
      Top             =   960
      Width           =   1935
   End
   Begin VB.OptionButton Option1 
      BackColor       =   &H80000002&
      Caption         =   "Addition"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   375
      Left            =   4800
      TabIndex        =   2
      Top             =   480
      Width           =   1575
   End
   Begin VB.CommandButton Command2 
      Caption         =   "New Problem"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1215
      Left            =   360
      TabIndex        =   1
      Top             =   2640
      Width           =   1935
   End
   Begin VB.CommandButton Command1 
      Caption         =   "Check Answer"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   975
      Left            =   4080
      TabIndex        =   0
      Top             =   2160
      Width           =   2415
   End
   Begin VB.Label Label5 
      BackColor       =   &H80000002&
      Height          =   495
      Left            =   240
      TabIndex        =   9
      Top             =   1440
      Width           =   255
   End
   Begin VB.Label Label3 
      BackColor       =   &H80000002&
      Caption         =   "-"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   240
      TabIndex        =   8
      Top             =   1440
      Width           =   255
   End
   Begin VB.Label Label4 
      BackColor       =   &H80000002&
      Height          =   495
      Left            =   600
      TabIndex        =   7
      Top             =   1440
      Width           =   495
   End
   Begin VB.Label Label2 
      BackColor       =   &H80000002&
      Caption         =   "+"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   600
      TabIndex        =   6
      Top             =   1440
      Width           =   375
   End
   Begin VB.Label Label1 
      BackColor       =   &H80000002&
      Caption         =   "Number Correct:"
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   495
      Left            =   3600
      TabIndex        =   5
      Top             =   3600
      Width           =   2655
   End
   Begin VB.Line Line1 
      BorderStyle     =   6  'Inside Solid
      X1              =   600
      X2              =   3600
      Y1              =   2040
      Y2              =   2040
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False


Private Sub Option1_Click()
If Label4.Visible = True Then
If Label5.Visible = False Then

    Label4.Visible = False
    Label5.Visible = True
Else 'get here when  cannot see label1
    Label4.Visible = True
    Label5.Visible = False
    
End If
End If
End Sub


Private Sub Option2_Click()
If Label4.Visible = False Then
If Label5.Visible = True Then

    Label4.Visible = True
    Label5.Visible = False
Else 'get here when  cannot see label1
    Label4.Visible = False
    Label5.Visible = True
    
End If

End If
End Sub

