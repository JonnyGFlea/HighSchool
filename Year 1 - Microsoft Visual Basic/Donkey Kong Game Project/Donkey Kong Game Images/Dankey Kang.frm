VERSION 5.00
Object = "{6BF52A50-394A-11D3-B153-00C04F79FAA6}#1.0#0"; "wmp.dll"
Begin VB.Form Form1 
   BackColor       =   &H80000008&
   BorderStyle     =   0  'None
   Caption         =   "Donkey Kong Arcade"
   ClientHeight    =   10845
   ClientLeft      =   0
   ClientTop       =   0
   ClientWidth     =   5625
   LinkTopic       =   "Form1"
   Picture         =   "Dankey Kang.frx":0000
   ScaleHeight     =   10845
   ScaleWidth      =   5625
   ShowInTaskbar   =   0   'False
   StartUpPosition =   2  'CenterScreen
   Begin VB.Timer barreltimer2 
      Interval        =   120
      Left            =   2520
      Top             =   9240
   End
   Begin VB.Timer oiltimer 
      Interval        =   300
      Left            =   2040
      Top             =   9240
   End
   Begin VB.Timer donktimer 
      Interval        =   500
      Left            =   1080
      Top             =   9240
   End
   Begin VB.Timer endgametimer 
      Enabled         =   0   'False
      Interval        =   100
      Left            =   1560
      Top             =   9240
   End
   Begin VB.Timer JumpTimer 
      Enabled         =   0   'False
      Interval        =   100
      Left            =   120
      Top             =   9240
   End
   Begin VB.Timer BarrelTimer 
      Interval        =   20
      Left            =   600
      Top             =   9240
   End
   Begin WMPLibCtl.WindowsMediaPlayer wmp1 
      Height          =   255
      Left            =   4680
      TabIndex        =   3
      Top             =   10080
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
      _cy             =   450
   End
   Begin WMPLibCtl.WindowsMediaPlayer wmp3 
      Height          =   375
      Left            =   4200
      TabIndex        =   2
      Top             =   10080
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
   Begin VB.Image keysright 
      Height          =   870
      Left            =   7320
      Picture         =   "Dankey Kang.frx":01F2
      Stretch         =   -1  'True
      Top             =   5160
      Visible         =   0   'False
      Width           =   1440
   End
   Begin VB.Image keysleft 
      Height          =   735
      Left            =   6000
      Picture         =   "Dankey Kang.frx":1945
      Stretch         =   -1  'True
      Top             =   5280
      Visible         =   0   'False
      Width           =   975
   End
   Begin VB.Image keysdown 
      Height          =   1110
      Left            =   7440
      Picture         =   "Dankey Kang.frx":3068
      Stretch         =   -1  'True
      Top             =   3960
      Visible         =   0   'False
      Width           =   1320
   End
   Begin VB.Image keysup 
      Height          =   1110
      Left            =   5880
      Picture         =   "Dankey Kang.frx":4766
      Stretch         =   -1  'True
      Top             =   3960
      Visible         =   0   'False
      Width           =   1320
   End
   Begin VB.Image keys 
      Height          =   870
      Left            =   2160
      Picture         =   "Dankey Kang.frx":5E5B
      Stretch         =   -1  'True
      Top             =   9840
      Width           =   1320
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H00000000&
      BorderStyle     =   1  'Fixed Single
      Caption         =   "3"
      BeginProperty Font 
         Name            =   "System"
         Size            =   19.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   495
      Left            =   120
      TabIndex        =   0
      Top             =   9840
      Width           =   495
   End
   Begin VB.Label Label2 
      Alignment       =   2  'Center
      BackColor       =   &H80000007&
      Caption         =   "Total Lives"
      BeginProperty Font 
         Name            =   "System"
         Size            =   9.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H000000FF&
      Height          =   375
      Left            =   480
      TabIndex        =   1
      Top             =   9960
      Width           =   1455
   End
   Begin VB.Image collide 
      Height          =   735
      Index           =   0
      Left            =   5160
      Picture         =   "Dankey Kang.frx":7632
      Stretch         =   -1  'True
      Top             =   1320
      Visible         =   0   'False
      Width           =   510
   End
   Begin VB.Image collideleft 
      Height          =   510
      Index           =   0
      Left            =   4080
      Picture         =   "Dankey Kang.frx":7911
      Stretch         =   -1  'True
      Top             =   8880
      Visible         =   0   'False
      Width           =   855
   End
   Begin VB.Image collideright 
      Height          =   510
      Index           =   0
      Left            =   960
      Picture         =   "Dankey Kang.frx":7BF0
      Stretch         =   -1  'True
      Top             =   7080
      Visible         =   0   'False
      Width           =   855
   End
   Begin VB.Image collideleft 
      Height          =   555
      Index           =   2
      Left            =   4080
      Picture         =   "Dankey Kang.frx":7ECF
      Stretch         =   -1  'True
      Top             =   5760
      Visible         =   0   'False
      Width           =   855
   End
   Begin VB.Image collideright 
      Height          =   555
      Index           =   1
      Left            =   960
      Picture         =   "Dankey Kang.frx":81AE
      Stretch         =   -1  'True
      Top             =   4440
      Visible         =   0   'False
      Width           =   855
   End
   Begin VB.Image collideleft 
      Height          =   510
      Index           =   1
      Left            =   5040
      Picture         =   "Dankey Kang.frx":848D
      Stretch         =   -1  'True
      Top             =   2880
      Visible         =   0   'False
      Width           =   735
   End
   Begin VB.Image oilb 
      Height          =   975
      Left            =   120
      Picture         =   "Dankey Kang.frx":876C
      Stretch         =   -1  'True
      Tag             =   "1"
      Top             =   8280
      Width           =   465
   End
   Begin VB.Image collidewin 
      Height          =   660
      Left            =   2400
      Top             =   120
      Width           =   660
   End
   Begin VB.Image barrel 
      Height          =   240
      Index           =   3
      Left            =   7560
      Picture         =   "Dankey Kang.frx":914A
      Top             =   2160
      Visible         =   0   'False
      Width           =   330
   End
   Begin VB.Image barrel 
      Height          =   240
      Index           =   2
      Left            =   7920
      Picture         =   "Dankey Kang.frx":9520
      Top             =   1800
      Visible         =   0   'False
      Width           =   330
   End
   Begin VB.Image barrel 
      Height          =   240
      Index           =   1
      Left            =   7920
      Picture         =   "Dankey Kang.frx":98F5
      Top             =   2160
      Visible         =   0   'False
      Width           =   330
   End
   Begin VB.Image barrel 
      Height          =   240
      Index           =   0
      Left            =   7560
      Picture         =   "Dankey Kang.frx":9CCD
      Top             =   1800
      Visible         =   0   'False
      Width           =   330
   End
   Begin VB.Image BarrelMain 
      Height          =   240
      Left            =   2160
      Picture         =   "Dankey Kang.frx":A0A6
      Stretch         =   -1  'True
      Tag             =   "1"
      Top             =   1680
      Width           =   330
   End
   Begin VB.Image Peachend 
      Height          =   480
      Left            =   7320
      Picture         =   "Dankey Kang.frx":A47F
      Top             =   3000
      Visible         =   0   'False
      Width           =   780
   End
   Begin VB.Image pech 
      Height          =   435
      Index           =   1
      Left            =   6000
      Picture         =   "Dankey Kang.frx":B841
      Top             =   3360
      Visible         =   0   'False
      Width           =   300
   End
   Begin VB.Image pech 
      Height          =   480
      Index           =   0
      Left            =   7320
      Picture         =   "Dankey Kang.frx":BF4F
      Top             =   2520
      Visible         =   0   'False
      Width           =   780
   End
   Begin VB.Image Oil 
      Height          =   615
      Index           =   2
      Left            =   6720
      Picture         =   "Dankey Kang.frx":D311
      Top             =   1680
      Visible         =   0   'False
      Width           =   300
   End
   Begin VB.Image Oil 
      Height          =   615
      Index           =   3
      Left            =   7080
      Picture         =   "Dankey Kang.frx":D851
      Top             =   1680
      Visible         =   0   'False
      Width           =   300
   End
   Begin VB.Image Oil 
      Height          =   615
      Index           =   0
      Left            =   6000
      Picture         =   "Dankey Kang.frx":DD91
      Top             =   1680
      Visible         =   0   'False
      Width           =   300
   End
   Begin VB.Image Oil 
      Height          =   615
      Index           =   1
      Left            =   6360
      Picture         =   "Dankey Kang.frx":E2EA
      Top             =   1680
      Visible         =   0   'False
      Width           =   300
   End
   Begin VB.Image MarioMain 
      Height          =   405
      Left            =   720
      Picture         =   "Dankey Kang.frx":E833
      Top             =   8800
      Width           =   210
   End
   Begin VB.Image Mario 
      Height          =   390
      Index           =   6
      Left            =   7680
      Picture         =   "Dankey Kang.frx":EBE7
      Top             =   1080
      Visible         =   0   'False
      Width           =   330
   End
   Begin VB.Image Mario 
      Height          =   405
      Index           =   5
      Left            =   7440
      Picture         =   "Dankey Kang.frx":EFC4
      Top             =   1080
      Visible         =   0   'False
      Width           =   255
   End
   Begin VB.Image Mario 
      Height          =   405
      Index           =   4
      Left            =   7200
      Picture         =   "Dankey Kang.frx":F37C
      Top             =   1080
      Visible         =   0   'False
      Width           =   255
   End
   Begin VB.Image Mario 
      Height          =   405
      Index           =   2
      Left            =   6600
      Picture         =   "Dankey Kang.frx":F730
      Top             =   1080
      Visible         =   0   'False
      Width           =   285
   End
   Begin VB.Image Mario 
      Height          =   405
      Index           =   1
      Left            =   6000
      Picture         =   "Dankey Kang.frx":FAF2
      Top             =   1080
      Visible         =   0   'False
      Width           =   285
   End
   Begin VB.Image Mario 
      Height          =   405
      Index           =   3
      Left            =   6960
      Picture         =   "Dankey Kang.frx":FEB6
      Top             =   1080
      Visible         =   0   'False
      Width           =   210
   End
   Begin VB.Image Mario 
      Height          =   405
      Index           =   0
      Left            =   6360
      Picture         =   "Dankey Kang.frx":10268
      Top             =   1080
      Visible         =   0   'False
      Width           =   210
   End
   Begin VB.Image girder 
      Height          =   525
      Index           =   5
      Left            =   0
      Picture         =   "Dankey Kang.frx":1061C
      Stretch         =   -1  'True
      Top             =   1920
      Width           =   5655
   End
   Begin VB.Image Image16 
      Height          =   525
      Left            =   525
      Picture         =   "Dankey Kang.frx":1191A
      Top             =   1440
      Width           =   495
   End
   Begin VB.Image PeachMan 
      Height          =   480
      Left            =   1800
      Picture         =   "Dankey Kang.frx":11D7C
      Tag             =   "1"
      Top             =   240
      Width           =   780
   End
   Begin VB.Image girder 
      Height          =   525
      Index           =   4
      Left            =   1440
      Picture         =   "Dankey Kang.frx":1313E
      Stretch         =   -1  'True
      Top             =   3240
      Width           =   4215
   End
   Begin VB.Image girder 
      Height          =   525
      Index           =   0
      Left            =   0
      Picture         =   "Dankey Kang.frx":1443C
      Stretch         =   -1  'True
      Top             =   9240
      Width           =   5655
   End
   Begin VB.Image girder 
      Height          =   525
      Index           =   1
      Left            =   0
      Picture         =   "Dankey Kang.frx":1573A
      Stretch         =   -1  'True
      Top             =   7440
      Width           =   4095
   End
   Begin VB.Image girder 
      Height          =   525
      Index           =   2
      Left            =   1080
      Picture         =   "Dankey Kang.frx":16A38
      Stretch         =   -1  'True
      Top             =   6000
      Width           =   4575
   End
   Begin VB.Image girder 
      Height          =   165
      Index           =   6
      Left            =   1680
      Picture         =   "Dankey Kang.frx":17D36
      Top             =   720
      Width           =   2175
   End
   Begin VB.Image girder 
      Height          =   525
      Index           =   3
      Left            =   0
      Picture         =   "Dankey Kang.frx":19034
      Stretch         =   -1  'True
      Top             =   4680
      Width           =   4095
   End
   Begin VB.Image Ladder 
      Height          =   1785
      Index           =   0
      Left            =   3600
      Picture         =   "Dankey Kang.frx":1A332
      Stretch         =   -1  'True
      Top             =   7440
      Width           =   570
   End
   Begin VB.Image Ladder 
      Height          =   1380
      Index           =   1
      Left            =   1080
      Picture         =   "Dankey Kang.frx":1B584
      Stretch         =   -1  'True
      Top             =   6000
      Width           =   570
   End
   Begin VB.Image Ladder 
      Height          =   1260
      Index           =   2
      Left            =   3600
      Picture         =   "Dankey Kang.frx":1C7D6
      Stretch         =   -1  'True
      Top             =   4680
      Width           =   570
   End
   Begin VB.Image Ladder 
      Height          =   1380
      Index           =   3
      Left            =   1440
      Picture         =   "Dankey Kang.frx":1DA28
      Stretch         =   -1  'True
      Top             =   3240
      Width           =   660
   End
   Begin VB.Image Ladder 
      Height          =   1260
      Index           =   4
      Left            =   5160
      Picture         =   "Dankey Kang.frx":1EC7A
      Stretch         =   -1  'True
      Top             =   1920
      Width           =   555
   End
   Begin VB.Image Ladder 
      Height          =   1140
      Index           =   5
      Left            =   3240
      Picture         =   "Dankey Kang.frx":1FECC
      Stretch         =   -1  'True
      Top             =   720
      Width           =   705
   End
   Begin VB.Image Image15 
      Height          =   540
      Left            =   0
      Picture         =   "Dankey Kang.frx":2111E
      Top             =   1440
      Width           =   540
   End
   Begin VB.Image Image17 
      Height          =   540
      Left            =   0
      Picture         =   "Dankey Kang.frx":2158A
      Top             =   960
      Width           =   540
   End
   Begin VB.Image dank 
      Height          =   885
      Index           =   2
      Left            =   5880
      Picture         =   "Dankey Kang.frx":219F6
      Top             =   2400
      Visible         =   0   'False
      Width           =   1200
   End
   Begin VB.Image collide 
      Height          =   735
      Index           =   4
      Left            =   4125
      Picture         =   "Dankey Kang.frx":21FA0
      Stretch         =   -1  'True
      Top             =   7080
      Visible         =   0   'False
      Width           =   510
   End
   Begin VB.Image collide 
      Height          =   735
      Index           =   1
      Left            =   1080
      Picture         =   "Dankey Kang.frx":2227F
      Stretch         =   -1  'True
      Top             =   2640
      Visible         =   0   'False
      Width           =   510
   End
   Begin VB.Image collide 
      Height          =   735
      Index           =   2
      Left            =   4080
      Picture         =   "Dankey Kang.frx":2255E
      Stretch         =   -1  'True
      Top             =   4440
      Visible         =   0   'False
      Width           =   510
   End
   Begin VB.Image dank 
      Height          =   765
      Index           =   0
      Left            =   6960
      Picture         =   "Dankey Kang.frx":2283D
      Top             =   120
      Visible         =   0   'False
      Width           =   1110
   End
   Begin VB.Image dank 
      Height          =   765
      Index           =   1
      Left            =   5760
      Picture         =   "Dankey Kang.frx":22EC3
      Top             =   120
      Visible         =   0   'False
      Width           =   1110
   End
   Begin VB.Image Donk 
      Height          =   885
      Left            =   840
      Picture         =   "Dankey Kang.frx":2354D
      Tag             =   "1"
      Top             =   1050
      Width           =   1200
   End
   Begin VB.Image dankend 
      Height          =   1050
      Left            =   1080
      Picture         =   "Dankey Kang.frx":23AF7
      Top             =   858
      Visible         =   0   'False
      Width           =   1065
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

Dim jumpcounter As Integer
Dim movestate As Integer
Dim barrelLeftInc As Integer
Dim barrelTopInc As Integer



Private Sub BarrelTimer_Timer()

If MarioMain.Left > Form1.Width Then
Backdrop.Show
Form1.Show
MarioMain.Left = 4920
MarioMain.Top = 1480
MarioMain.Picture = Mario(3).Picture
End If

'If Donk.Picture = dank(1).Picture Then
'    Donk.Left = 1080
'    Donk.Top = 1150
'End If


BarrelMain.Left = BarrelMain.Left + barrelLeftInc
BarrelMain.Top = BarrelMain.Top + barrelTopInc

If BarrelMain.Left > Ladder(5).Left Then
 '   Donk.Picture = dank(0).Picture
   ' Donk.Left = Donk.Left - 75
End If


If BarrelMain.Left > Ladder(5).Left Then
  '  Donk.Picture = dank(1).Picture
   ' Donk.Left = Donk.Left + 50
End If

'barrelmovement
If BarrelMain.Left > collide(0).Left And BarrelMain.Top + BarrelMain.Height - 40 < collide(0).Top + collide(0).Height Then
    barrelLeftInc = 0
    barrelTopInc = 100
End If

If BarrelMain.Left > collideleft(1).Left And BarrelMain.Top + BarrelMain.Height - 40 < collideleft(1).Top + collideleft(1).Height And BarrelMain.Top > collideleft(1).Top Then
    barrelLeftInc = -50
    barrelTopInc = 0
    End If


If BarrelMain.Top > collide(1).Top And BarrelMain.Left < collide(1).Left And BarrelMain.Top + BarrelMain.Height > collide(1).Top Then
    barrelLeftInc = 0
    barrelTopInc = 100
    End If

If BarrelMain.Left > collideright(1).Left And BarrelMain.Top + BarrelMain.Height - 40 < collideright(1).Top + collideright(1).Height And BarrelMain.Top > collideright(1).Top Then
    BarrelMain.Top = BarrelMain.Top - 15
    barrelLeftInc = 50
    barrelTopInc = 0
    End If

If BarrelMain.Left > collide(2).Left And BarrelMain.Top + BarrelMain.Height > collide(2).Top And BarrelMain.Width + BarrelMain.Left < collide(2).Left + collide(2).Width Then
    barrelLeftInc = 0
    barrelTopInc = 100
    End If

If BarrelMain.Left > collideleft(2).Left And BarrelMain.Top + BarrelMain.Height - 40 < collideleft(2).Top + collideleft(2).Height And BarrelMain.Top > collideleft(2).Top Then
    BarrelMain.Top = BarrelMain.Top - 25
    barrelLeftInc = -50
    barrelTopInc = 0
    End If

If BarrelMain.Left > collideright(0).Left And BarrelMain.Top + BarrelMain.Height - 40 < collideright(0).Top + collideright(0).Height And BarrelMain.Top > collideright(0).Top Then
    BarrelMain.Top = BarrelMain.Top + 2
    barrelLeftInc = 50
    barrelTopInc = 0
    End If
    
If BarrelMain.Left > collide(4).Left And BarrelMain.Top + BarrelMain.Height > collide(4).Top And BarrelMain.Width + BarrelMain.Left < collide(4).Left + collide(4).Width Then
    barrelLeftInc = 0
    barrelTopInc = 50
    End If

If BarrelMain.Left > collideleft(0).Left And BarrelMain.Top + BarrelMain.Height - 40 < collideleft(0).Top + collideleft(0).Height And BarrelMain.Top > collideleft(0).Top Then
    BarrelMain.Top = BarrelMain.Top + 2
    barrelLeftInc = 50
    barrelTopInc = 0
    End If
    
'barrelreset
If BarrelMain.Left > Form1.Width Then
BarrelMain.Left = 2160
BarrelMain.Top = 1680
End If

'animationbarrelroll
If BarrelMain.Left = 2160 And BarrelMain.Top = 1680 Then
Donk.Picture = dank(2).Picture
Donk.Top = 1030
Donk.Left = 840
End If




'marioreset
If MarioMain.Left < BarrelMain.Left + BarrelMain.Width And MarioMain.Left > BarrelMain.Left And MarioMain.Top + MarioMain.Height < BarrelMain.Top + BarrelMain.Height And MarioMain.Top + MarioMain.Height > BarrelMain.Top Then
MarioMain.Picture = Mario(0).Picture
MarioMain.Top = 8800
MarioMain.Left = 720
Label1.Caption = Label1.Caption - 1
    If Label1.Caption = 0 Then
    wmp1.URL = App.Path + "\dead.mp3"
    wmp1.settings.setMode "loop", False
    MarioMain.Picture = Mario(6).Picture
    answer = MsgBox("GAME OVER! You Failed!")
    Form1.Hide
    Form4.Show
    MarioMain.Picture = Mario(0).Picture
    Label1.Caption = "3"
    End If
End If




End Sub

Private Sub barreltimer2_Timer()
If BarrelMain.Tag = 1 Then
    BarrelMain.Picture = barrel(0).Picture
    BarrelMain.Tag = 2
Else
    If BarrelMain.Tag = 2 Then
    BarrelMain.Picture = barrel(3).Picture
    BarrelMain.Tag = 3
    Else
        If BarrelMain.Tag = 3 Then
        BarrelMain.Picture = barrel(2).Picture
        BarrelMain.Tag = 4
        Else
            If BarrelMain.Tag = 4 Then
            BarrelMain.Picture = barrel(1).Picture
            BarrelMain.Tag = 1
            End If
        End If
    End If
End If
End Sub

Private Sub donktimer_Timer()
If Donk.Tag = 1 Then 'original pic

    Donk.Picture = dank(0).Picture
    Donk.Tag = 2
    Donk.Left = 1080
    Donk.Top = 1150
Else

    If Donk.Tag = 2 Then
        Donk.Left = 1080
        Donk.Top = 1150
        Donk.Picture = dank(1).Picture
        Donk.Tag = 3
    Else
        Donk.Left = 1080
        Donk.Top = 1150
        Donk.Picture = dank(0).Picture
        Donk.Tag = 2
    End If
    
End If


If PeachMan.Tag = 1 Then
    PeachMan.Picture = pech(0).Picture
    PeachMan.Tag = 2
Else
    
    If PeachMan.Tag = 2 Then
    PeachMan.Picture = pech(1).Picture
    PeachMan.Tag = 1
    End If
End If
    

End Sub

Private Sub Form_Load()
movestate = 0
jumpcounter = 0
barrelstate = 0
barrelLeftInc = 50
barrelTopInc = 0
wmp1.URL = App.Path + "\dksong.mp3"
wmp1.settings.setMode "loop", True
End Sub
Private Sub Form_KeyDown(KeyCode As Integer, Shift As Integer)

'movement
If KeyCode = 39 Then 'right
keys.Picture = keysright.Picture
    MarioMain = Mario(0)
    If movestate = 0 Then
    movestate = 1
    MarioMain = Mario(0)
    MarioMain.Left = MarioMain.Left + 50
Else
    movestate = 0
    MarioMain = Mario(1)
    MarioMain.Left = MarioMain.Left + 50
    End If
End If



If KeyCode = 37 Then 'left
keys.Picture = keysleft.Picture
    MarioMain = Mario(3)
    If movestate = 0 Then
    movestate = 1
    MarioMain = Mario(3)
    MarioMain.Left = MarioMain.Left - 50
Else
    movestate = 0
    MarioMain = Mario(2)
    MarioMain.Left = MarioMain.Left - 50
    End If
End If


If KeyCode = 38 Then 'up
    For g = 0 To 5
    keys.Picture = keysup.Picture
        If MarioMain.Left < Ladder(g).Left + Ladder(g).Width And MarioMain.Left > Ladder(g).Left And MarioMain.Top < Ladder(g).Top + Ladder(g).Height And MarioMain.Top + MarioMain.Height > Ladder(g).Top Then
        MarioMain = Mario(4)
        If movestate = 0 Then
        movestate = 1
        MarioMain = Mario(4)
        MarioMain.Top = MarioMain.Top - 50
        Else
        movestate = 0
        MarioMain = Mario(5)
        MarioMain.Top = MarioMain.Top - 50
        End If
        End If
    Next g
End If



For g = 0 To 5
If MarioMain.Left < Ladder(g).Left + Ladder(g).Width And MarioMain.Left > Ladder(g).Left And MarioMain.Top + MarioMain.Height < Ladder(g).Top + Ladder(g).Height And MarioMain.Top + MarioMain.Height > Ladder(g).Top Then
    If KeyCode = 40 Then 'down
    keys.Picture = keysdown.Picture
            MarioMain = Mario(4)
        If movestate = 0 Then
        movestate = 1
        MarioMain = Mario(4)
        MarioMain.Top = MarioMain.Top + 50
    Else
        movestate = 0
        MarioMain = Mario(5)
        MarioMain.Top = MarioMain.Top + 50
        End If
    End If
End If
Next g

'jump code
If KeyCode = 32 Then 'jump
    JumpTimer.Enabled = True
    jumpcounter = 0
End If

'barrel collide code
If BarrelMain.Left > MarioMain.Left + MarioMain.Width And BarrelMain.Left + BarrelMain.Width < MarioMain.Left Then
End
End If

'win code
If MarioMain.Top > collidewin.Top And MarioMain.Top + MarioMain.Height < collidewin.Top + collidewin.Height Then
    wmp3.URL = App.Path + "\win.mp3"
    PeachMan.Picture = Peachend.Picture
    Donk.Visible = False
    dankend.Visible = True
    endgametimer.Enabled = True
End If

End Sub
Private Sub endgametimer_Timer()
PeachMan.Tag = 50
wmp1.Close
MarioMain.Picture = Mario(3).Picture
MarioMain.Left = MarioMain.Left - 50
MarioMain.Picture = Mario(2).Picture
MarioMain.Left = MarioMain.Left - 50
MarioMain.Picture = Mario(3).Picture
MarioMain.Left = MarioMain.Left - 50
If MarioMain.Left < PeachMan.Left + PeachMan.Width Then
endgametimer.Enabled = False
answer = MsgBox("GAME OVER! You saved Peach!")
End
End If
End Sub

Private Sub JumpTimer_Timer()
jumpcounter = jumpcounter + 1
If jumpcounter < 5 Then
MarioMain.Top = MarioMain.Top - 150
MarioMain = Mario(1)
Else
    If jumpcounter < 8 Then
    MarioMain.Top = MarioMain.Top + 200
    Else
    JumpTimer.Enabled = False
    MarioMain = Mario(0)
    End If
End If
End Sub

Private Sub oiltimer_Timer()
If oilb.Tag = 1 Then
    oilb.Picture = Oil(0).Picture
    oilb.Tag = 2
Else
    If oilb.Tag = 2 Then
    oilb.Picture = Oil(1).Picture
    oilb.Tag = 3
    Else
        If oilb.Tag = 3 Then
        oilb.Picture = Oil(2).Picture
        oilb.Tag = 4
        Else
            If oilb.Tag = 4 Then
            oilb.Picture = Oil(3).Picture
            oilb.Tag = 1
            End If
        End If
    End If
End If

End Sub

Private Sub WindowsMediaPlayer1_OpenStateChange(ByVal NewState As Long)

End Sub
