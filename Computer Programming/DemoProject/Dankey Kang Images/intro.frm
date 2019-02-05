VERSION 5.00
Object = "{6BF52A50-394A-11D3-B153-00C04F79FAA6}#1.0#0"; "wmp.dll"
Begin VB.Form Form3 
   BackColor       =   &H80000007&
   BorderStyle     =   0  'None
   Caption         =   "Form3"
   ClientHeight    =   15360
   ClientLeft      =   0
   ClientTop       =   0
   ClientWidth     =   19200
   LinkTopic       =   "Form3"
   ScaleHeight     =   15360
   ScaleWidth      =   19200
   ShowInTaskbar   =   0   'False
   StartUpPosition =   3  'Windows Default
   Begin VB.Timer timers 
      Enabled         =   0   'False
      Interval        =   12000
      Left            =   16680
      Top             =   10320
   End
   Begin VB.Timer changetimer 
      Enabled         =   0   'False
      Interval        =   1
      Left            =   18120
      Top             =   10320
   End
   Begin VB.Timer peachtimer 
      Interval        =   10
      Left            =   17400
      Top             =   10320
   End
   Begin WMPLibCtl.WindowsMediaPlayer wmp2 
      Height          =   375
      Left            =   1440
      TabIndex        =   0
      Top             =   1320
      Visible         =   0   'False
      Width           =   255
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
      _cx             =   450
      _cy             =   661
   End
   Begin VB.Image intro 
      Height          =   4500
      Left            =   3720
      Picture         =   "intro.frx":0000
      Top             =   4800
      Visible         =   0   'False
      Width           =   11520
   End
   Begin VB.Image donkeychase 
      Height          =   2520
      Left            =   9840
      Picture         =   "intro.frx":F522
      Top             =   720
      Visible         =   0   'False
      Width           =   4500
   End
   Begin VB.Image peachrun 
      Height          =   2490
      Left            =   15240
      Picture         =   "intro.frx":11614
      Top             =   0
      Visible         =   0   'False
      Width           =   4560
   End
   Begin VB.Image peach 
      Height          =   2490
      Left            =   16400
      Picture         =   "intro.frx":131FE
      Top             =   6120
      Width           =   4560
   End
   Begin VB.Image donkey 
      Height          =   2520
      Left            =   720
      Picture         =   "intro.frx":143EA
      Tag             =   "1"
      Top             =   6120
      Width           =   4500
   End
End
Attribute VB_Name = "Form3"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub changetimer_Timer()



peachtimer.Enabled = False
If donkey.Tag = 1 Then
        donkey.Picture = donkeychase.Picture
        donkey.Tag = 2
    Else
    If donkey.Tag = 2 Then
        donkey.Picture = donkey.Picture
        donkey.Tag = 1
    End If
End If
donkey.Left = donkey.Left + 100
peach.Picture = peachrun.Picture
peach.Left = peach.Left + 150

If donkey.Left > Form3.Width Then
intro.Visible = True
Form3.Refresh
For k = 1 To 400000000
Next k
Form3.Hide
Form1.Show
changetimer.Enabled = False
End If
'kmokm
End Sub

Private Sub Form_Load()
wmp2.URL = App.Path + "\dk.mp3"


End Sub

Private Sub peachtimer_Timer()

peach.Left = peach.Left - 100

If peach.Left = 10000 Then
peach.Left = 10000
changetimer.Enabled = True
End If

End Sub

Private Sub timers_Timer()


'timers.Enabled = False
End Sub
