# ChatterBox

<!-- This is the edited manifest.xml for our project-->


<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="10dp"
    android:longClickable="false">

    <!-- General layout of android XML are as follows:
    Every view in an android app needs to also be created in an xml file for the .java file that it appears in.
    
    The id is the id that is set to the views/buttons so that your code call the id as needed
    for example, in Main.java, button10 is set to: (Button) findViewById(R.id.tip10); which would give button 10 the attributes of id tip10
     
     The layouts align the views onto the screen as set by you. The TextView below is using relative layouts,
     it is centered on the vertical axis and has content wrapping enabled. For the buttons below, you can see that
     they are spaced relative to eachother, in this case, above the other
     
     If the views have text, the strings that are used are pulled from strings.xml
     For example, the text prompt below uses a string called enter_bill, whose value is 
     inside strings.xml (Enter total bill amount)
     -->
     
     <!-- A view that prompts the user to enter a bill -->
    <TextView
        android:id="@+id/text_prompt"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/enter_bill"
        android:textSize="20sp"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="95dp" />

    <!-- A field for the edit text, a view that can take input from the user, placed below the textview -->
    <EditText
        android:id="@+id/editText1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:ems="10"
        android:inputType="numberDecimal"
        android:layout_centerVertical="true"
        android:layout_centerHorizontal="true">

        <requestFocus />
    </EditText>

    <!-- Make a button for 5% tip that will be above the 10% tip button  -->
    
   <!-- Button for 20% tip -->
  	<Button
  		android:id="@+id/tip20"
        android:text="@string/button_20" 
        android:layout_width="120dp"
        android:layout_height="wrap_content"
        android:layout_alignTop="@+id/tip15"
        android:layout_alignRight="@+id/text_prompt" />

<!-- Button for 15% tip -->
    <Button
        android:id="@+id/tip15"
        android:text="@string/button_15" 
        android:layout_width="120dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="32dp"
        android:layout_below="@+id/editText1"
        android:layout_alignLeft="@+id/text_prompt" />

    <!-- The text in this line is not a background. Must find a way to make it anonymous -->
    <EditText
        android:id="@+id/editText2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:ems="10"
        android:inputType="numberDecimal"
        android:layout_marginTop="33dp"
        android:layout_below="@+id/text_prompt"
        android:layout_alignLeft="@+id/editText1" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/promptText_1"
        android:textSize="20sp"
        android:layout_alignTop="@+id/editText2"
        android:layout_alignLeft="@+id/textView2" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/promptText_2"
        android:textSize="20sp"
        android:layout_centerVertical="true"
        android:layout_centerHorizontal="true" />
    <!-- Button for 10% tip -->

    <!-- Text view for "select tip" on the main menu-->

</RelativeLayout>
