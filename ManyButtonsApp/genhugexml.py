for r in range(20):
	print('<LinearLayout android:layout_width="match_parent" android:layout_height="wrap_content">')
	for c in range(5):
		print('<Button android:id="@+id/button_' + str(r) + '_' + str(c) + '" android:onClick="buttonClicked" android:layout_width="0dp" android:layout_height="wrap_content" android:layout_weight="1" android:text="' + str(r) + '_' + str(c) + '"/>')
	print('</LinearLayout>')
