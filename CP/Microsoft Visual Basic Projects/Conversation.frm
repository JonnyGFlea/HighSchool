VERSION 5.00
Begin VB.Form Form1 
   BackColor       =   &H0000FF00&
   Caption         =   "Form1"
   ClientHeight    =   7605
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   9690
   LinkTopic       =   "Form1"
   ScaleHeight     =   7605
   ScaleWidth      =   9690
   StartUpPosition =   3  'Windows Default
   Begin VB.CommandButton Command1 
      Caption         =   "Make Me Talk To You"
      BeginProperty Font 
         Name            =   "Small Fonts"
         Size            =   13.5
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   1215
      Left            =   2640
      TabIndex        =   4
      Top             =   3360
      Width           =   3375
   End
   Begin VB.TextBox Text2 
      BackColor       =   &H0000C000&
      BeginProperty Font 
         Name            =   "Small Fonts"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   5760
      TabIndex        =   3
      Top             =   2160
      Width           =   2535
   End
   Begin VB.TextBox Text1 
      BackColor       =   &H0000C000&
      BeginProperty Font 
         Name            =   "Small Fonts"
         Size            =   8.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   735
      Left            =   5160
      TabIndex        =   2
      Top             =   600
      Width           =   2535
   End
   Begin VB.Label Label3 
      BackColor       =   &H0000FF00&
      BeginProperty Font 
         Name            =   "Small Fonts"
         Size            =   20.25
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   2535
      Left            =   840
      TabIndex        =   5
      Top             =   5040
      Width           =   8295
   End
   Begin VB.Label Label2 
      BackColor       =   &H0000FF00&
      Caption         =   "Enter Favorite Food:"
      BeginProperty Font 
         Name            =   "Small Fonts"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   600
      TabIndex        =   1
      Top             =   2160
      Width           =   4935
   End
   Begin VB.Label Label1 
      BackColor       =   &H0000FF00&
      Caption         =   "Enter First Name:"
      BeginProperty Font 
         Name            =   "Small Fonts"
         Size            =   24
         Charset         =   0
         Weight          =   700
         Underline       =   0   'False
         Italic          =   0   'False
         Strikethrough   =   0   'False
      EndProperty
      Height          =   855
      Left            =   600
      TabIndex        =   0
      Top             =   600
      Width           =   4455
   End
End
Attribute VB_Name = "Form1"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub Command1_Click()

If Text1.Text = "" And Text2.Text = "" Then
 Label3.Caption = "Hi there Stranger, What's your Favorite Food?"
Else
 Label3.Caption = "Hi there " + Text1 + "!" + " I like " + Text2 + " too!"
End If

If Text1.Text = "" And Text2.DataChanged = True Then
 Label3.Caption = "Hi there Stranger," + " I like " + Text2 + " too!"
End If

If Text2.Text = "" And Text1.DataChanged = True Then
 Label3.Caption = "Hi there " + Text1 + "! What's your favorite food?"
End If


End Sub

