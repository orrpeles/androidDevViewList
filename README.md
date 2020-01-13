Creating a listView and displaying an array inside of it.
Main challange is implementing adapter. There are many adapter depending the data you want to display.
An ArrayAdapter passes three arguments:
ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.ListView,StringArray);

1.) this;
2.) layout defined in XML (must have TextView otherwise there would be error when running the app)
3.) final argement is the array of of strings to be populated in the text view

Once array adapter has been created, it needs to be called on listview:
listView.setAdapter(i);

Resource: https://www.tutorialspoint.com/android/android_list_view.htm

