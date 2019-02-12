VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H80000003&
   Caption         =   "Form1"
   ClientHeight    =   8025
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   9765
   LinkTopic       =   "Form1"
   ScaleHeight     =   8025
   ScaleWidth      =   9765
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command2 
      Caption         =   "Super Encypt Message"
      BeginProperty Font 
         Name            =   "Modern No. 20"
         Size            =   15.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1215
      Left            =   2760
      TabIndex        =   3
      Top             =   5280
      Width           =   4455
   End
   Begin VB.CommandButton Command1 
      Appearance      =   0  'Flat
      Caption         =   "Encypt Message"
      BeginProperty Font 
         Name            =   "Modern No. 20"
         Size            =   15.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1215
      Left            =   2760
      TabIndex        =   2
      Top             =   2640
      Width           =   4455
   End
   Begin VB.TextBox Text1 
      BackColor       =   &H80000002&
      Height          =   735
      Left            =   3720
      TabIndex        =   1
      Top             =   720
      Width           =   2895
   End
   Begin VB.Label Label3 
      BackColor       =   &H80000002&
      BeginProperty Font 
         Name            =   "Modern No. 20"
         Size            =   15.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFF00&
      Height          =   855
      Left            =   1200
      TabIndex        =   5
      Top             =   6840
      Width           =   7935
   End
   Begin VB.Label Label2 
      BackColor       =   &H80000002&
      BeginProperty Font 
         Name            =   "Modern No. 20"
         Size            =   15.75
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      ForeColor       =   &H00FFFF00&
      Height          =   855
      Left            =   1200
      TabIndex        =   4
      Top             =   4080
      Width           =   7935
   End
   Begin VB.Label Label1 
      Alignment       =   2  'Center
      BackColor       =   &H80000003&
      Caption         =   "Enter a Message:"
      BeginProperty Font 
         Name            =   "Modern No. 20"
         Size            =   14.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   960
      TabIndex        =   0
      Top             =   840
      Width           =   2415
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()
Label2 = ""

For k = 1 To Len(Text1.Text)
   thechar = Mid(Text1, k, 1)
  
   theasc = Asc(thechar)
   Label2 = Label2 + Str(theasc)
   
Next k
End Sub

Private Sub Command2_Click()
Label3 = ""

For k = 1 To Len(Text1.Text)
   thechar = Mid(Text1, k, 1)
  
   theasc = Asc(thechar) + 5
   Label3 = Label3 + Chr(theasc)

Next k

End Sub

