package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            BA.Log("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 363, 460);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _imgicon = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpath = null;
public static boolean _isicon = false;
public static String _sfilename = "";
public static anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper _rbios = null;
public static anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper _rbandroid = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 19;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 20;BA.debugLine="MainForm.SetFormStyle(\"UNIFIED\")";
_mainform.SetFormStyle("UNIFIED");
 //BA.debugLineNum = 21;BA.debugLine="MainForm.Resizable = False";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 22;BA.debugLine="MainForm.RootPane.LoadLayout(\"frm1\")";
_mainform.getRootPane().LoadLayout(ba,"frm1");
 //BA.debugLineNum = 23;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 25;BA.debugLine="fx.ShowExternalDocument(\"https://telegram.me/stud";
_fx.ShowExternalDocument("https://telegram.me/studentcomputer");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static String  _btnchoosefile_action() throws Exception{
anywheresoftware.b4j.objects.FileChooserWrapper _fa = null;
 //BA.debugLineNum = 29;BA.debugLine="Sub btnchoosefile_Action";
 //BA.debugLineNum = 31;BA.debugLine="Dim fa As FileChooser";
_fa = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 32;BA.debugLine="fa.Initialize";
_fa.Initialize();
 //BA.debugLineNum = 33;BA.debugLine="fa.SetExtensionFilter(\"Png File\",Array As String(";
_fa.SetExtensionFilter("Png File",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.png"}));
 //BA.debugLineNum = 34;BA.debugLine="fa.Title = \"Choose png file\"";
_fa.setTitle("Choose png file");
 //BA.debugLineNum = 35;BA.debugLine="sFilename = fa.ShowOpen(MainForm)";
_sfilename = _fa.ShowOpen(_mainform);
 //BA.debugLineNum = 37;BA.debugLine="If sFilename.Length > 0 Then";
if (_sfilename.length()>0) { 
 //BA.debugLineNum = 38;BA.debugLine="Try";
try { //BA.debugLineNum = 39;BA.debugLine="imgicon.SetImage(fx.LoadImage(\"\",sFilename))";
_imgicon.SetImage((javafx.scene.image.Image)(_fx.LoadImage("",_sfilename).getObject()));
 //BA.debugLineNum = 40;BA.debugLine="isIcon = True";
_isicon = anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 42;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 };
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static String  _btnchoosefolder_action() throws Exception{
anywheresoftware.b4j.objects.DirectoryChooserWrapper _fa = null;
 //BA.debugLineNum = 48;BA.debugLine="Sub btnchoosefolder_Action";
 //BA.debugLineNum = 50;BA.debugLine="Dim fa As DirectoryChooser";
_fa = new anywheresoftware.b4j.objects.DirectoryChooserWrapper();
 //BA.debugLineNum = 51;BA.debugLine="fa.Initialize";
_fa.Initialize();
 //BA.debugLineNum = 52;BA.debugLine="fa.Title = \"Choose png file\"";
_fa.setTitle("Choose png file");
 //BA.debugLineNum = 53;BA.debugLine="txtpath.Text = fa.Show(MainForm)";
_txtpath.setText(_fa.Show(_mainform));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static String  _btnexit_action() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub btnexit_Action";
 //BA.debugLineNum = 58;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public static String  _btnmake_action() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub btnmake_Action";
 //BA.debugLineNum = 63;BA.debugLine="If isIcon = False Then";
if (_isicon==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 64;BA.debugLine="fx.Msgbox(MainForm,\"Please choose png file\",\"Ico";
_fx.Msgbox(_mainform,"Please choose png file","Icon");
 //BA.debugLineNum = 65;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 68;BA.debugLine="If txtpath.Text.Length = 0 Then";
if (_txtpath.getText().length()==0) { 
 //BA.debugLineNum = 69;BA.debugLine="fx.Msgbox(MainForm,\"Please select folder for sav";
_fx.Msgbox(_mainform,"Please select folder for save output","Folder");
 //BA.debugLineNum = 70;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 73;BA.debugLine="If File.Exists(txtpath.Text,\"\") = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_txtpath.getText(),"")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 74;BA.debugLine="fx.Msgbox(MainForm,\"Please select valid folder\",";
_fx.Msgbox(_mainform,"Please select valid folder","Folder");
 //BA.debugLineNum = 75;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 78;BA.debugLine="If rbandroid.Selected = True Then";
if (_rbandroid.getSelected()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 79;BA.debugLine="MakeAndroidIcon";
_makeandroidicon();
 }else {
 //BA.debugLineNum = 81;BA.debugLine="MakeiOSIcon";
_makeiosicon();
 };
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public static String  _makeandroidicon() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub MakeAndroidIcon";
 //BA.debugLineNum = 88;BA.debugLine="File.MakeDir(txtpath.Text,\"drawable-ldpi\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_txtpath.getText(),"drawable-ldpi");
 //BA.debugLineNum = 89;BA.debugLine="File.MakeDir(txtpath.Text,\"drawable-mdpi\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_txtpath.getText(),"drawable-mdpi");
 //BA.debugLineNum = 90;BA.debugLine="File.MakeDir(txtpath.Text,\"drawable-hdpi\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_txtpath.getText(),"drawable-hdpi");
 //BA.debugLineNum = 91;BA.debugLine="File.MakeDir(txtpath.Text,\"drawable-xhdpi\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_txtpath.getText(),"drawable-xhdpi");
 //BA.debugLineNum = 92;BA.debugLine="File.MakeDir(txtpath.Text,\"drawable-xxhdpi\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_txtpath.getText(),"drawable-xxhdpi");
 //BA.debugLineNum = 93;BA.debugLine="File.MakeDir(txtpath.Text,\"drawable-xxxhdpi\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_txtpath.getText(),"drawable-xxxhdpi");
 //BA.debugLineNum = 95;BA.debugLine="SaveImage(fx.LoadImageSample(\"\",sFilename,36,36),";
_saveimage(_fx.LoadImageSample("",_sfilename,36,36),_txtpath.getText()+"\\drawable-ldpi","icon.png");
 //BA.debugLineNum = 96;BA.debugLine="SaveImage(fx.LoadImageSample(\"\",sFilename,72,72),";
_saveimage(_fx.LoadImageSample("",_sfilename,72,72),_txtpath.getText()+"\\drawable-hdpi","icon.png");
 //BA.debugLineNum = 97;BA.debugLine="SaveImage(fx.LoadImageSample(\"\",sFilename,48,48),";
_saveimage(_fx.LoadImageSample("",_sfilename,48,48),_txtpath.getText()+"\\drawable-mdpi","icon.png");
 //BA.debugLineNum = 98;BA.debugLine="SaveImage(fx.LoadImageSample(\"\",sFilename,96,96),";
_saveimage(_fx.LoadImageSample("",_sfilename,96,96),_txtpath.getText()+"\\drawable-xhdpi","icon.png");
 //BA.debugLineNum = 99;BA.debugLine="SaveImage(fx.LoadImageSample(\"\",sFilename,144,144";
_saveimage(_fx.LoadImageSample("",_sfilename,144,144),_txtpath.getText()+"\\drawable-xxhdpi","icon.png");
 //BA.debugLineNum = 100;BA.debugLine="SaveImage(fx.LoadImageSample(\"\",sFilename,192,192";
_saveimage(_fx.LoadImageSample("",_sfilename,192,192),_txtpath.getText()+"\\drawable-xxxhdpi","icon.png");
 //BA.debugLineNum = 102;BA.debugLine="fx.Msgbox(MainForm,\"Icon created successfully for";
_fx.Msgbox(_mainform,"Icon created successfully for Android","Alert");
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public static String  _makeiosicon() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub MakeiOSIcon";
 //BA.debugLineNum = 108;BA.debugLine="SaveImage(fx.LoadImageSample(\"\",sFilename,60,60),";
_saveimage(_fx.LoadImageSample("",_sfilename,60,60),_txtpath.getText(),"icon-60.png");
 //BA.debugLineNum = 109;BA.debugLine="SaveImage(fx.LoadImageSample(\"\",sFilename,120,120";
_saveimage(_fx.LoadImageSample("",_sfilename,120,120),_txtpath.getText(),"icon-60@2x.png");
 //BA.debugLineNum = 110;BA.debugLine="SaveImage(fx.LoadImageSample(\"\",sFilename,76,76),";
_saveimage(_fx.LoadImageSample("",_sfilename,76,76),_txtpath.getText(),"icon-76.png");
 //BA.debugLineNum = 111;BA.debugLine="SaveImage(fx.LoadImageSample(\"\",sFilename,152,152";
_saveimage(_fx.LoadImageSample("",_sfilename,152,152),_txtpath.getText(),"icon-76@2x.png");
 //BA.debugLineNum = 113;BA.debugLine="fx.Msgbox(MainForm,\"Icon created successfully for";
_fx.Msgbox(_mainform,"Icon created successfully for iOS","Alert");
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="Private imgicon As ImageView";
_imgicon = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private txtpath As TextField";
_txtpath = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private isIcon As Boolean";
_isicon = false;
 //BA.debugLineNum = 12;BA.debugLine="Private sFilename As String";
_sfilename = "";
 //BA.debugLineNum = 13;BA.debugLine="Private rbios As RadioButton";
_rbios = new anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private rbandroid As RadioButton";
_rbandroid = new anywheresoftware.b4j.objects.ButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public static String  _rbandroid_selectedchange(boolean _selected) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Sub rbandroid_SelectedChange(Selected As Boolean)";
 //BA.debugLineNum = 133;BA.debugLine="If Selected Then";
if (_selected) { 
 //BA.debugLineNum = 134;BA.debugLine="rbios.Selected = False";
_rbios.setSelected(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public static String  _rbios_selectedchange(boolean _selected) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub rbios_SelectedChange(Selected As Boolean)";
 //BA.debugLineNum = 127;BA.debugLine="If Selected Then";
if (_selected) { 
 //BA.debugLineNum = 128;BA.debugLine="rbandroid.Selected = False";
_rbandroid.setSelected(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public static String  _saveimage(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _image1,String _filepath,String _filename) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _ou = null;
 //BA.debugLineNum = 117;BA.debugLine="Sub SaveImage(image1 As Image,FilePath As String,F";
 //BA.debugLineNum = 119;BA.debugLine="Dim ou As OutputStream";
_ou = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 120;BA.debugLine="ou = File.OpenOutput(FilePath,Filename,False)";
_ou = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_filepath,_filename,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 121;BA.debugLine="image1.WriteToStream(ou)";
_image1.WriteToStream((java.io.OutputStream)(_ou.getObject()));
 //BA.debugLineNum = 122;BA.debugLine="ou.Close";
_ou.Close();
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
}
