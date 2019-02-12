VERSION 5.00
Object = "{6BF52A50-394A-11D3-B153-00C04F79FAA6}#1.0#0"; "wmp.dll"
Begin VB.Form Form4 
   BackColor       =   &H80000007&
   BorderStyle     =   0  'None
   Caption         =   "Form4"
   ClientHeight    =   15360
   ClientLeft      =   0
   ClientTop       =   0
   ClientWidth     =   19200
   LinkTopic       =   "Form4"
   ScaleHeight     =   15360
   ScaleWidth      =   19200
   ShowInTaskbar   =   0   'False
   StartUpPosition =   3  'Windows Default
   Begin VB.Timer Timer1 
      Interval        =   100
      Left            =   2280
      Top             =   6120
   End
   Begin WMPLibCtl.WindowsMediaPlayer wmp4 
      Height          =   495
      Left            =   1680
      TabIndex        =   2
      Top             =   360
      Visible         =   0   'False
      Width           =   375
      URL             =   ""
      rate            =   1
      balance         =   0
      currentPosition =   0
      defaultFrame    =   ""
      playCount       =   1
      autoStart       =   -1  'True
      currentMarker   =   0
      invokeURLs      =   -1  'True
      baseURL         =   ""
      volume          =   50
      mute            =   0   'False
      uiMode          =   "full"
      stretchToFit    =   0   'False
      windowlessVideo =   0   'False
      enabled         =   -1  'True
      enableContextMenu=   -1  'True
      fullScreen      =   0   'False
      SAMIStyle       =   ""
      SAMILang        =   ""
      SAMIFilename    =   ""
      captioningID    =   ""
      enableErrorDialogs=   0   'False
      _cx             =   661
      _cy             =   873
   End
   Begin VB.Label Label2 
      BackColor       =   &H80000007&
      Caption         =   "Retry?"
      BeginProperty Font 
         Name            =   "System"
         Size            =   19.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFFFF&
      Height          =   615
      Left            =   8640
      TabIndex        =   1
      Top             =   6720
      Visible         =   0   'False
      Width           =   2655
   End
   Begin VB.Image Image4 
      Height          =   720
      Left            =   720
      Picture         =   "endgame.frx":0000
      Top             =   2880
      Visible         =   0   'False
      Width           =   1425
   End
   Begin VB.Image Image3 
      Height          =   720
      Left            =   720
      Picture         =   "endgame.frx":0B5A
      Top             =   1920
      Visible         =   0   'False
      Width           =   1425
   End
   Begin VB.Label Label1 
      BackColor       =   &H80000007&
      Caption         =   "Quit?"
      BeginProperty Font 
         Name            =   "System"
         Size            =   19.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFFFF&
      Height          =   615
      Left            =   8640
      TabIndex        =   0
      Top             =   7440
      Visible         =   0   'False
      Width           =   2055
   End
   Begin VB.Image Image1 
      Height          =   2850
      Left            =   5640
      Picture         =   "endgame.frx":16C2
      Stretch         =   -1  'True
      Top             =   3600
      Visible         =   0   'False
      Width           =   7515
   End
   Begin VB.Image Image2 
      Height          =   2040
      Left            =   7920
      Picture         =   "endgame.frx":25A4
      Stretch         =   -1  'True
      Top             =   6360
      Visible         =   0   'False
      Width           =   3585
   End
End
Attribute VB_Name = "Form4"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_KeyDown(KeyCode As Integer, Shift As Integer)
If KeyCode = 38 Then 'up
Image2.Picture = Image4.Picture
End If

If KeyCode = 40 Then 'down
Image2.Picture = Image3.Picture
End If

If KeyCode = 13 And Image2.Picture = Image3.Picture Then 'enter
End
End If

If KeyCode = 13 And Image2.Picture = Image4.Picture Then 'enter
Form4.Hide
wmp4.Close

Form1.Refresh
Form1.Show
End If

End Sub

Private Sub Form_Load()
Image1.Visible = True
wmp4.URL = App.Path + "\gameover.mp3"
wmp4.settings.setMode "loop", True
End Sub

Private Sub Timer1_Timer()
Form4.Refresh
For k = 1 To 400000000
Next k
Image2.Visible = True
Label1.Visible = True
Label2.Visible = True
Timer1.Enabled = False
End Sub
