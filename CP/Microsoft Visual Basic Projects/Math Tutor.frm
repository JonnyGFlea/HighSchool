VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H00008000&
   Caption         =   "Form1"
   ClientHeight    =   7635
   ClientLeft      =   225
   ClientTop       =   855
   ClientWidth     =   9765
   LinkTopic       =   "Form1"
   ScaleHeight     =   7635
   ScaleWidth      =   9765
   StartUpPosition =   3  'Windows Default
   Begin VB.TextBox Text1 
      BackColor       =   &H8000000C&
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   24
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   975
      Left            =   2040
      TabIndex        =   8
      Top             =   4320
      Width           =   3135
   End
   Begin VB.CommandButton Command2 
      Caption         =   "Next Question"
      Height          =   1095
      Left            =   6240
      TabIndex        =   4
      Top             =   5880
      Width           =   3015
   End
   Begin VB.CommandButton Command1 
      BackColor       =   &H80000003&
      Caption         =   "Check Answer"
      Height          =   1095
      Left            =   6240
      TabIndex        =   3
      Top             =   4440
      Width           =   3015
   End
   Begin VB.OptionButton Option3 
      BackColor       =   &H0000C000&
      Caption         =   "Multiplication"
      Height          =   735
      Left            =   6240
      TabIndex        =   2
      Top             =   3000
      Width           =   3015
   End
   Begin VB.OptionButton Option2 
      BackColor       =   &H0000C000&
      Caption         =   "Subtraction"
      Height          =   735
      Left            =   6240
      TabIndex        =   1
      Top             =   1920
      Width           =   3015
   End
   Begin VB.OptionButton Option1 
      BackColor       =   &H0000C000&
      Caption         =   "Addition"
      Height          =   735
      Left            =   6240
      TabIndex        =   0
      Top             =   840
      Width           =   3015
   End
   Begin VB.Label Label5 
      BackColor       =   &H00C0FFC0&
      Caption         =   "0"
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
      Left            =   8280
      TabIndex        =   10
      Top             =   7080
      Width           =   975
   End
   Begin VB.Label Label4 
      BackColor       =   &H00C0FFC0&
      Caption         =   "Answers correct"
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
      Left            =   6240
      TabIndex        =   9
      Top             =   7080
      Width           =   2415
   End
   Begin VB.Image Image2 
      Height          =   1455
      Left            =   3360
      Picture         =   "Math Tutor.frx":0000
      Stretch         =   -1  'True
      Top             =   5760
      Width           =   1935
   End
   Begin VB.Image Image1 
      Height          =   1455
      Left            =   960
      Picture         =   "Math Tutor.frx":018A
      Stretch         =   -1  'True
      Top             =   5760
      Width           =   1935
   End
   Begin VB.Label Label3 
      Alignment       =   2  'Center
      BackColor       =   &H00008000&
      BeginProperty Font 
         Name            =   "Showcard Gothic"
         Size            =   36
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   1920
      TabIndex        =   7
      Top             =   2760
      Width           =   975
   End
   Begin VB.Line Line1 
      X1              =   2280
      X2              =   4800
      Y1              =   3960
      Y2              =   3960
   End
   Begin VB.Label Label2 
      BackColor       =   &H00008000&
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
      Left            =   3240
      TabIndex        =   6
      Top             =   2760
      Width           =   1575
   End
   Begin VB.Label Label1 
      BackColor       =   &H00008000&
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
      Left            =   3240
      TabIndex        =   5
      Top             =   1680
      Width           =   1575
   End
   Begin VB.Menu Menu1 
      Caption         =   "&Menu"
      NegotiatePosition=   1  'Left
      Begin VB.Menu menu4 
         Caption         =   "Easy Mode"
      End
      Begin VB.Menu Menu3 
         Caption         =   "Hard Mode"
      End
      Begin VB.Menu menu2 
         Caption         =   "E&xit"
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Combo1_Change()

End Sub

Private Sub Command1_Click()
If Option1.Value Then
    If Val(Label1) + Val(Label2) = Val(Text1) Then
    Image1.Visible = True
    Image2.Visible = False
Else
    Image1.Visible = False
    Image2.Visible = True
   End If
End If
If Option2.Value Then
    If Val(Label1) - Val(Label2) = Val(Text1) Then
    Image1.Visible = True
    Image2.Visible = False
Else
    Image1.Visible = False
    Image2.Visible = True
   End If
End If
If Option3.Value Then
    If Val(Label1) * Val(Label2) = Val(Text1) Then
    Image1.Visible = True
    Image2.Visible = False
Else
    Image1.Visible = False
    Image2.Visible = True
   End If
End If

If Image1.Visible = True Then
Label5 = Label5 + 1
End If
If Image2.Visible = True Then
Label5.Caption = "0"
End If



End Sub

Private Sub Command2_Click()
Text1.Text = ""

Image1.Visible = False
Image2.Visible = False
Randomize Timer
Label1.Caption = Int(Rnd * 10 + 1)
Label2.Caption = Int(Rnd * 10 + 1)

Do
    Label1.Caption = Int(Rnd * 10 + 1)
    Label2.Caption = Int(Rnd * 10 + 1)
Loop While Val(Label1) < Val(Label2)

Do
If Menu3.Checked = True Then
    Label1.Caption = Int(Rnd * 100 + 1)
    Label2.Caption = Int(Rnd * 100 + 1)
End If
Loop While Val(Label1) < Val(Label2)


End Sub

Private Sub Form_Load()

menu4.Checked = True

Randomize Timer
Label1.Caption = Int(Rnd * 10 + 1)
Label2.Caption = Int(Rnd * 10 + 1)
Image1.Visible = False
Image2.Visible = False


If Menu3.Checked = True Then
    Randomize Timer
    Label1.Caption = Int(Rnd * 100 + 1)
    Label2.Caption = Int(Rnd * 100 + 1)
End If

End Sub

Private Sub Label3_Click()

If Option1.Value = True Then
    Label3.Appearance = "add"
End If

If Option2.Value = True Then
    Label3.Appearance = "-"
End If

If Option3.Value = True Then
    Label3.Appearance = "x"
End If

End Sub

Private Sub menu2_Click()
    End
End Sub

Private Sub Menu3_Click()

Menu3.Checked = True
menu4.Checked = False

Label1.Caption = Int(Rnd * 100 + 1)
Label2.Caption = Int(Rnd * 100 + 1)

End Sub

Private Sub menu4_Click()

Menu3.Checked = False
menu4.Checked = True


Label1.Caption = Int(Rnd * 10 + 1)
Label2.Caption = Int(Rnd * 10 + 1)

End Sub


Private Sub Option1_Click()
Label3.Caption = "+"


End Sub

Private Sub Option2_Click()


Label3.Caption = "-"
'child friendly
Do
    Label1.Caption = Int(Rnd * 10 + 1)
    Label2.Caption = Int(Rnd * 10 + 1)
Loop While Val(Label1) < Val(Label2)
'hard mode
Do
If Menu3.Checked = True Then
    Label1.Caption = Int(Rnd * 100 + 1)
    Label2.Caption = Int(Rnd * 100 + 1)
End If
Loop While Val(Label1) < Val(Label2)



End Sub

Private Sub Option3_Click()

Label3.Caption = "x"
End Sub

