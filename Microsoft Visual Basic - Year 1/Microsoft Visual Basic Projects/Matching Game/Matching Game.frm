VERSION 5.00
Begin VB.Form Form1 
   Caption         =   "Form1"
   ClientHeight    =   7620
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   9765
   LinkTopic       =   "Form1"
   ScaleHeight     =   7620
   ScaleWidth      =   9765
   StartUpPosition =   3  'Windows Default
   Begin VB.Label Label1 
      Caption         =   "Super Smash Matching Game"
      BeginProperty Font 
         Name            =   "Rockwell"
         Size            =   15.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1575
      Left            =   1440
      TabIndex        =   0
      Top             =   120
      Width           =   6615
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   15
      Left            =   5880
      Stretch         =   -1  'True
      Top             =   6000
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   14
      Left            =   4560
      Stretch         =   -1  'True
      Top             =   6000
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   13
      Left            =   3240
      Stretch         =   -1  'True
      Top             =   6000
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   12
      Left            =   1920
      Stretch         =   -1  'True
      Top             =   6000
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   11
      Left            =   5880
      Stretch         =   -1  'True
      Top             =   4680
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   10
      Left            =   4560
      Stretch         =   -1  'True
      Top             =   4680
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   9
      Left            =   3240
      Stretch         =   -1  'True
      Top             =   4680
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   8
      Left            =   1920
      Stretch         =   -1  'True
      Top             =   4680
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   7
      Left            =   5880
      Stretch         =   -1  'True
      Top             =   3360
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   6
      Left            =   4560
      Stretch         =   -1  'True
      Top             =   3360
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   5
      Left            =   3240
      Stretch         =   -1  'True
      Top             =   3360
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   4
      Left            =   1920
      Stretch         =   -1  'True
      Top             =   3360
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   3
      Left            =   5880
      Stretch         =   -1  'True
      Top             =   2040
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   2
      Left            =   4560
      Stretch         =   -1  'True
      Top             =   2040
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   1
      Left            =   3240
      Stretch         =   -1  'True
      Top             =   2040
      Width           =   1215
   End
   Begin VB.Image Image1 
      Height          =   1215
      Index           =   0
      Left            =   1920
      Picture         =   "Matching Game.frx":0000
      Stretch         =   -1  'True
      Top             =   2040
      Width           =   1215
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_Load()

Dim imgpic(0 To 15) As String

End Sub

Private Sub Image1_Click(Index As Integer)

Open App.Path + "X:\CP\Matching Game\matchpic.txt" For Input As #1
For k = 0 To 15
    Input #1, imgpic(k)
Next k
Close #1

'Shuffle pictures

Randomize Timer
For i = 1 To 10
    For j = 0 To 15
        k = Int(Rnd * 16)
        temp1 = imgpic(k)
        imgpic(k) = imgpic(j)
        imgpic(j) = temp1
    Next j
Next i

'Load pictures into images

For k = 0 To 15
    ImgUnder(k).Visible = False
    ImgUnder(k).Picture = LoadPicture(App.Path + "X:\CP\Matching Game\SmashBall.jpg" + imgpic(k))

Next k
End Sub
