VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H8000000D&
   Caption         =   "Form1"
   ClientHeight    =   7560
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   9795
   LinkTopic       =   "Form1"
   ScaleHeight     =   7560
   ScaleWidth      =   9795
   StartUpPosition =   3  'Windows Default
   Begin VB.OptionButton Option4 
      BackColor       =   &H8000000D&
      Caption         =   "XTREME MODE "
      BeginProperty Font 
         Name            =   "Comic Sans MS"
         Size            =   15.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   6840
      TabIndex        =   11
      Top             =   3240
      Width           =   2895
   End
   Begin VB.OptionButton Option3 
      BackColor       =   &H8000000D&
      Caption         =   "Hard Mode "
      BeginProperty Font 
         Name            =   "Comic Sans MS"
         Size            =   15.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      Height          =   615
      Left            =   6840
      TabIndex        =   7
      Top             =   2640
      Width           =   2775
   End
   Begin VB.OptionButton Option2 
      BackColor       =   &H8000000D&
      Caption         =   "Easy Mode"
      BeginProperty Font 
         Name            =   "Comic Sans MS"
         Size            =   14.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   6840
      TabIndex        =   6
      Top             =   1920
      Width           =   2535
   End
   Begin VB.OptionButton Option1 
      BackColor       =   &H8000000D&
      Caption         =   "Baby Mode"
      BeginProperty Font 
         Name            =   "Comic Sans MS"
         Size            =   12
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   -1  'True
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   6840
      TabIndex        =   5
      Top             =   1320
      Width           =   2535
   End
   Begin VB.TextBox Txtguess 
      BeginProperty Font 
         Name            =   "MS Sans Serif"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1095
      Left            =   3480
      TabIndex        =   2
      Top             =   2520
      Width           =   3015
   End
   Begin VB.CommandButton CmdGame 
      Caption         =   "New Game"
      BeginProperty Font 
         Name            =   "Comic Sans MS"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1335
      Left            =   5280
      TabIndex        =   1
      Top             =   4440
      Width           =   3615
   End
   Begin VB.CommandButton CmdGuess 
      Caption         =   "Check Guess"
      BeginProperty Font 
         Name            =   "Comic Sans MS"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1335
      Left            =   840
      TabIndex        =   0
      Top             =   4440
      Width           =   3615
   End
   Begin VB.Label Label5 
      BackColor       =   &H8000000D&
      Caption         =   "0"
      BeginProperty Font 
         Name            =   "Comic Sans MS"
         Size            =   27.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   8520
      TabIndex        =   10
      Top             =   6120
      Width           =   1215
   End
   Begin VB.Label Label4 
      BackColor       =   &H8000000D&
      BeginProperty Font 
         Name            =   "Comic Sans MS"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   975
      Left            =   600
      TabIndex        =   9
      Top             =   6240
      Width           =   3855
   End
   Begin VB.Label Label3 
      BackColor       =   &H8000000D&
      Caption         =   "Number of Guesses:"
      BeginProperty Font 
         Name            =   "Comic Sans MS"
         Size            =   15.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1215
      Left            =   5040
      TabIndex        =   8
      Top             =   6360
      Width           =   3375
   End
   Begin VB.Label Label2 
      BackColor       =   &H8000000D&
      Caption         =   "10"
      BeginProperty Font 
         Name            =   "Comic Sans MS"
         Size            =   18
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   6960
      TabIndex        =   4
      Top             =   240
      Width           =   1335
   End
   Begin VB.Label Label1 
      BackColor       =   &H8000000D&
      Caption         =   "I'm thinking of a number between 1 and"
      BeginProperty Font 
         Name            =   "Comic Sans MS"
         Size            =   18
         Charset         =   0
         Weight          =   400
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   240
      TabIndex        =   3
      Top             =   240
      Width           =   6735
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim num As Integer

Private Sub CmdGame_Click()
Label5 = 0
Txtguess = ""
Label4 = ""

If Option1.Value = True Then
    Randomize Timer
    num = Int(Rnd * 10 + 1)
End If
If Option2.Value = True Then
    Randomize Timer
    num = Int(Rnd * 100 + 1)
End If
If Option3.Value = True Then
    Randomize Timer
    num = Int(Rnd * 1000 + 1)
End If
If Option4.Value = True Then
    Randomize Timer
    num = Int(Rnd * 10000 + 1)
End If

End Sub

Private Sub CmdGuess_Click()
If Txtguess.Text > num Then
    Label4.Caption = "Too High!"
End If
If Txtguess.Text < num Then
    Label4.Caption = "Too Low!"
End If

If Txtguess.Text = num Then
    Label4.Caption = "You got it!!!"
End If
Label5 = Label5 + 1

End Sub

Private Sub Image1_Click()

End Sub

Private Sub Option1_Click()
Label2.Caption = 10

Randomize Timer

num = Int(Rnd * 10 + 1)

End Sub

Private Sub Option2_Click()

Label2.Caption = 100

Randomize Timer

num = Int(Rnd * 100 + 1)

End Sub

Private Sub Option3_Click()

Label2.Caption = 1000

Randomize Timer

num = Int(Rnd * 1000 + 1)
End Sub

Private Sub Option4_Click()

Label2.Caption = 10000

Randomize Timer

num = Int(Rnd * 10000 + 1)
End Sub

Private Sub Picture1_Click()

End Sub
