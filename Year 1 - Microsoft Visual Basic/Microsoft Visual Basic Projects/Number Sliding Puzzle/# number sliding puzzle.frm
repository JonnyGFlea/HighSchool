VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H008080FF&
   Caption         =   "Form1"
   ClientHeight    =   7635
   ClientLeft      =   225
   ClientTop       =   855
   ClientWidth     =   9765
   LinkTopic       =   "Form1"
   ScaleHeight     =   7635
   ScaleWidth      =   9765
   StartUpPosition =   3  'Windows Default
   Begin VB.Label Label2 
      Alignment       =   2  'Center
      BackColor       =   &H008080FF&
      Caption         =   "Number Sliding Puzzle Game"
      BeginProperty Font 
         Name            =   "Kristen ITC"
         Size            =   12
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   1200
      TabIndex        =   9
      Top             =   360
      Width           =   6855
   End
   Begin VB.Label Label1 
      Caption         =   "Label1"
      Height          =   1200
      Index           =   8
      Left            =   5880
      TabIndex        =   8
      Top             =   4560
      Width           =   1560
   End
   Begin VB.Label Label1 
      Caption         =   "Label1"
      Height          =   1200
      Index           =   7
      Left            =   4080
      TabIndex        =   7
      Top             =   4560
      Width           =   1560
   End
   Begin VB.Label Label1 
      Caption         =   "Label1"
      Height          =   1200
      Index           =   6
      Left            =   2280
      TabIndex        =   6
      Top             =   4560
      Width           =   1560
   End
   Begin VB.Label Label1 
      Caption         =   "Label1"
      Height          =   1200
      Index           =   5
      Left            =   5880
      TabIndex        =   5
      Top             =   3120
      Width           =   1560
   End
   Begin VB.Label Label1 
      Caption         =   "Label1"
      Height          =   1200
      Index           =   4
      Left            =   4080
      TabIndex        =   4
      Top             =   3120
      Width           =   1560
   End
   Begin VB.Label Label1 
      Caption         =   "Label1"
      Height          =   1200
      Index           =   3
      Left            =   2280
      TabIndex        =   3
      Top             =   3120
      Width           =   1560
   End
   Begin VB.Label Label1 
      Caption         =   "Label1"
      Height          =   1200
      Index           =   2
      Left            =   5880
      TabIndex        =   2
      Top             =   1680
      Width           =   1560
   End
   Begin VB.Label Label1 
      Caption         =   "Label1"
      Height          =   1200
      Index           =   1
      Left            =   4080
      TabIndex        =   1
      Top             =   1680
      Width           =   1560
   End
   Begin VB.Label Label1 
      Caption         =   "Label1"
      Height          =   1200
      Index           =   0
      Left            =   2280
      TabIndex        =   0
      Top             =   1680
      Width           =   1560
   End
   Begin VB.Menu Menu0 
      Caption         =   "Difficulty"
      Begin VB.Menu menu1 
         Caption         =   "Easy"
      End
      Begin VB.Menu menu2 
         Caption         =   "Medium"
      End
      Begin VB.Menu menu3 
         Caption         =   "Hard"
      End
      Begin VB.Menu menu4 
         Caption         =   "SUPER HARD "
      End
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Dim num As Integer
Dim shuffle As Integer

Private Sub Form_Load()

For k = 0 To 7
    Label1(k).Caption = k + 1
Next k
Label1(8) = " "

Randomize Timer

shuffle = 1
For k = 1 To 100
    num = Int(Rnd * 9)
    Call Label1_Click(num)
Next k
shuffle = 2  'shuffle = 2 indicates that the
'                          shuffling is done

End Sub

Private Sub Label1_Click(Index As Integer)
moved = False
If Label1(Index).Caption <> " " Then
    If Index = 0 Then
        If Label1(1).Caption = " " Then
            Label1(1) = Label1(Index)
            moved = True
        End If
        If Label1(3).Caption = " " Then
            Label1(3) = Label1(Index)
            moved = True
        End If
    End If
End If

If Label1(Index).Caption <> " " Then
    If Index = 1 Then
        If Label1(0).Caption = " " Then
            Label1(0) = Label1(Index)
            moved = True
        End If
        If Label1(2).Caption = " " Then
            Label1(2) = Label1(Index)
            moved = True
        End If
         If Label1(4).Caption = " " Then
            Label1(4) = Label1(Index)
            moved = True
        End If
    End If
End If

If Label1(Index).Caption <> " " Then
    If Index = 2 Then
        If Label1(1).Caption = " " Then
            Label1(1) = Label1(Index)
            moved = True
        End If
        If Label1(5).Caption = " " Then
            Label1(5) = Label1(Index)
            moved = True
        End If
    End If
End If

If Label1(Index).Caption <> " " Then
    If Index = 3 Then
        If Label1(0).Caption = " " Then
            Label1(0) = Label1(Index)
            moved = True
        End If
        If Label1(4).Caption = " " Then
            Label1(4) = Label1(Index)
            moved = True
        End If
        If Label1(6).Caption = " " Then
            Label1(6) = Label1(Index)
            moved = True
        End If
    End If
End If

If Label1(Index).Caption <> " " Then
    If Index = 4 Then
        If Label1(1).Caption = " " Then
            Label1(1) = Label1(Index)
            moved = True
        End If
        If Label1(3).Caption = " " Then
            Label1(3) = Label1(Index)
            moved = True
        End If
        If Label1(5).Caption = " " Then
            Label1(5) = Label1(Index)
            moved = True
        End If
        If Label1(7).Caption = " " Then
            Label1(7) = Label1(Index)
            moved = True
        End If
    End If
End If

If Label1(Index).Caption <> " " Then
    If Index = 5 Then
        If Label1(2).Caption = " " Then
            Label1(2) = Label1(Index)
            moved = True
        End If
        If Label1(4).Caption = " " Then
            Label1(4) = Label1(Index)
            moved = True
        End If
        If Label1(8).Caption = " " Then
            Label1(8) = Label1(Index)
            moved = True
        End If
    End If
End If

If Label1(Index).Caption <> " " Then
    If Index = 6 Then
        If Label1(3).Caption = " " Then
            Label1(3) = Label1(Index)
            moved = True
        End If
        If Label1(7).Caption = " " Then
            Label1(7) = Label1(Index)
            moved = True
        End If
    End If
End If

If Label1(Index).Caption <> " " Then
    If Index = 7 Then
        If Label1(4).Caption = " " Then
            Label1(4) = Label1(Index)
            moved = True
        End If
        If Label1(6).Caption = " " Then
            Label1(6) = Label1(Index)
            moved = True
        End If
        If Label1(8).Caption = " " Then
            Label1(8) = Label1(Index)
            moved = True
        End If
    End If
End If

If Label1(Index).Caption <> " " Then
    If Index = 8 Then
        If Label1(5).Caption = " " Then
            Label1(5) = Label1(Index)
            moved = True
        End If
        If Label1(7).Caption = " " Then
            Label1(7) = Label1(Index)
            moved = True
        End If
    End If
End If

    'matches with If Index = 5 Then
            
    'If Index = 1 Then
     '   YOU WILL NEED MORE CODE HERE!!!
         'End If    'matches with If Index = 1 Then

' the following line of code checks if any labels moved
' if any labels changed, it will make the clicked label blank
' since we only need to do one thing, we will NOT use a blocked If ... Then....End If statement
     If moved Then Label1(Index) = " "

'End If  'matches with If Label1(Index).Caption <> " " Then

If Label1(Index).Caption <> " " Then
    If Index = 8 Then
        If Label1(5).Caption = " " Then
            Label1(5) = Label1(Index)
            moved = True
        End If
        If Label1(4).Caption = " " Then
            Label1(4) = Label1(Index)
            moved = True
        End If
    End If  'matches with If Index = 5 Then
            
    'If Index = 1 Then
     '   YOU WILL NEED MORE CODE HERE!!!
         'End If    'matches with If Index = 1 Then


' the following line of code checks if any labels moved
' if any labels changed, it will make the clicked label blank
' since we only need to do one thing, we will NOT use a blocked If ... Then....End If statement
     If moved Then Label1(Index) = " "

End If  'matches with If Label1(Index).Caption <> " " Then

If Label1(Index).Caption <> " " Then
    If Index = 4 Then
        If Label1(5).Caption = " " Then
            Label1(5) = Label1(Index)
            moved = True
        End If
        If Label1(4).Caption = " " Then
            Label1(4) = Label1(Index)
            moved = True
        End If
    End If  'matches with If Index = 5 Then
    

' the following line of code checks if any labels moved
' if any labels changed, it will make the clicked label blank
' since we only need to do one thing, we will NOT use a blocked If ... Then....End If statement
     If moved Then Label1(Index) = " "

End If  'matches with If Label1(Index).Caption <> " " Then
'Code to check for winning:
If shuffle = 2 Then 'make sure you are done shuffling
                   

If Label1(0).Caption = "1" And Label1(1).Caption = "2" And Label1(2).Caption = "3" And Label1(3).Caption = "4" And Label1(4).Caption = "5" And Label1(5).Caption = "6" And Label1(6).Caption = "7" And Label1(7).Caption = "8" And Label1(8).Caption = " " Then
    MsgBox ("You Won!")
End If
             
End If
End Sub
Private Sub menu1_Click()
menu1.Checked = True
menu2.Checked = False
menu3.Checked = False
menu4.Checked = False

For k = 0 To 7
    Label1(k).Caption = k + 1
Next k
Label1(8) = " "

Randomize Timer

shuffle = 1
For k = 1 To 10
    num = Int(Rnd * 9)
    Call Label1_Click(num)
Next k
shuffle = 2
End Sub

Private Sub menu2_Click()
menu1.Checked = False
menu2.Checked = True
menu3.Checked = False
menu4.Checked = False

For k = 0 To 7
    Label1(k).Caption = k + 1
Next k
Label1(8) = " "

Randomize Timer

shuffle = 1
For k = 1 To 100
    num = Int(Rnd * 9)
    Call Label1_Click(num)
Next k
shuffle = 2

End Sub

Private Sub menu3_Click()
menu1.Checked = False
menu2.Checked = False
menu3.Checked = True
menu4.Checked = False

For k = 0 To 7
    Label1(k).Caption = k + 1
Next k
Label1(8) = " "

Randomize Timer

shuffle = 1
For k = 1 To 1000
    num = Int(Rnd * 9)
    Call Label1_Click(num)
Next k
shuffle = 2
End Sub

Private Sub menu4_Click()
menu1.Checked = False
menu2.Checked = False
menu3.Checked = False
menu4.Checked = True

For k = 0 To 7
    Label1(k).Caption = k + 1
Next k
Label1(8) = " "

Randomize Timer

shuffle = 1
For k = 1 To 10000
    num = Int(Rnd * 9)
    Call Label1_Click(num)
Next k
shuffle = 2

End Sub
