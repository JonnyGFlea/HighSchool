VERSION 5.00
Object = "{6BF52A50-394A-11D3-B153-00C04F79FAA6}#1.0#0"; "wmp.dll"
Begin VB.Form Form2 
   BorderStyle     =   0  'None
   Caption         =   "Form2"
   ClientHeight    =   12030
   ClientLeft      =   1020
   ClientTop       =   1275
   ClientWidth     =   14865
   LinkTopic       =   "Form2"
   ScaleHeight     =   12030
   ScaleWidth      =   14865
   ShowInTaskbar   =   0   'False
   WindowState     =   2  'Maximized
   Begin WMPLibCtl.WindowsMediaPlayer wmp 
      Height          =   255
      Left            =   360
      TabIndex        =   1
      Top             =   360
      Visible         =   0   'False
      Width           =   495
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
      _cx             =   873
      _cy             =   450
   End
   Begin VB.Label Label1 
      BackColor       =   &H80000007&
      Caption         =   "SS"
      BeginProperty Font 
         Name            =   "System"
         Size            =   39
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000080FF&
      Height          =   975
      Left            =   7920
      TabIndex        =   0
      Top             =   9240
      Width           =   1095
   End
   Begin VB.Image Image1 
      Height          =   15360
      Left            =   0
      Picture         =   "startup.frx":0000
      Top             =   0
      Width           =   19200
   End
End
Attribute VB_Name = "Form2"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Form_KeyDown(KeyCode As Integer, Shift As Integer)
If KeyCode = 65 Then
Form3.Show
Form3.Refresh
For k = 1 To 100000
Next k
Form2.Hide
wmp.Close
End If

End Sub

Private Sub Form_Load()
wmp.URL = App.Path + "\dkstart.mp3"
wmp.settings.setMode "loop", True

End Sub

