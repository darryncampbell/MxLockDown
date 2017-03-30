package com.darryncampbell.presentations.mxlockdown;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.symbol.emdk.*;
import com.symbol.emdk.EMDKManager.EMDKListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements EMDKListener, AdapterView.OnItemSelectedListener {

    //Assign the profile name used in EMDKConfig.xml
    private ProfileManager profileManager = null;
    private EMDKManager emdkManager;
    private TextView txtDescription = null;
    private final int PROFILE_NAME_TEXT = 0;
    private final int PROFILE_NAME = 1;
    private final int PROFILE = 2;
    private final int PROFILE_DESCRIPTION = 3;
    private int selectedProfile = -1;

    private String[][] profiles = {
            {
                    "NotificationPullDown Enable",  //  Combo box text
                    "Notification",                 //  Profile name from EMDKConfig.xml
                    Profiles.NotificationPullDownEnable,    //  Actual profile to apply
                    //  Description to display
                    "Controls whether a device user will be allowed to \"pull down\" the Notifications/Status bar and access the Notifications panel. Depending on the Android version, the Notifications panel displays application alerts, text messages, widgets and other notifications, and provides access to device Settings. Preventing access to the Notification Pulldown can prevent a device user from accessing device Settings and other system objects that might allow a user to change system behavior or navigate away from the current application.\n\nAllows the Notifications panel to be pulled down."
            },
            {
                    "NotificationPullDown Disable",
                    "Notification",
                    Profiles.NotificationPullDownDisable,
                    "Controls whether a device user will be allowed to \"pull down\" the Notifications/Status bar and access the Notifications panel. Depending on the Android version, the Notifications panel displays application alerts, text messages, widgets and other notifications, and provides access to device Settings. Preventing access to the Notification Pulldown can prevent a device user from accessing device Settings and other system objects that might allow a user to change system behavior or navigate away from the current application.\n\nPrevents the Notifications panel from being pulled down."
            },
            {
                    "NotificationGear Show",
                    "Notification",
                    Profiles.NotificationGearShow,
                    "Controls whether the \"Gear\" icon is displayed in the Android Notifications panel. The Gear icon provides immediate access to Wi-Fi, Bluetooth, GPS and other commonly used System settings without having to go through the Settings panel. The Notifications panel is accessed from most applications by dragging downward from the Notification/Status bar at the top of the Android screen. Hiding the Gear icon can prevent a device user from accessing those Settings and changing device behavior.\n\nShows the Gear icon in the Notifications panel."
            },
            {
                    "NotificationGear Hide",
                    "Notification",
                    Profiles.NotificationGearHide,
                    "Controls whether the \"Gear\" icon is displayed in the Android Notifications panel. The Gear icon provides immediate access to Wi-Fi, Bluetooth, GPS and other commonly used System settings without having to go through the Settings panel. The Notifications panel is accessed from most applications by dragging downward from the Notification/Status bar at the top of the Android screen. Hiding the Gear icon can prevent a device user from accessing those Settings and changing device behavior.\n\nHides the Gear icon in the Notifications panel."
            },
            {
                    "NotificationQuickSettings Enable",
                    "Notification",
                    Profiles.NotificationQuickSettingsEnabled,
                    "Controls whether Quick Settings can be accessed using a two-finger downward swipe gesture on some versions of Android. Quick Settings icons provide immediate access to Wi-Fi, Bluetooth, GPS and other commonly used System settings without having to go through the Settings panel. Disabling Quick Settings access can prevent a device user from changing device behavior.\n\nEnables access to Quick Settings using a two-finger downward swipe."
            },
            {
                    "NotificationQuickSettings Disable",
                    "Notification",
                    Profiles.NotificationQuickSettingsDisabled,
                    "Controls whether Quick Settings can be accessed using a two-finger downward swipe gesture on some versions of Android. Quick Settings icons provide immediate access to Wi-Fi, Bluetooth, GPS and other commonly used System settings without having to go through the Settings panel. Disabling Quick Settings access can prevent a device user from changing device behavior.\n\nDisables access to Quick Settings using a two-finger downward swipe."
            },
            {
                    "Clipboard Enable",
                    "Notification",
                    Profiles.ClipboardEnable,
                    "Controls whether the Clipboard function can be used, potentially enabling a device user to move data from one app to another.\n\nEnables the Clipboard function to be used."
            },
            {
                    "Clipboard Disable",
                    "Notification",
                    Profiles.ClipboardDisable,
                    "Controls whether the Clipboard function can be used, potentially enabling a device user to move data from one app to another.\n\nDisables use of the Clipboard function. Note- This will prevent the user from using the copy and paste functions for moving data to and from the clipboard. Attempting to use a disabled clipboard will result in an Android Toast message stating that the clipboard is disabled."
            },
            {
                    "AccessManagerSettings Full",
                    "AccessManager",
                    Profiles.AccessManagerSettingsFull,
                    "Select the level of system settings access to be allowed on the device's System Settings menu\n\nThis value will cause the device user to be allowed to access the full capabilities of the in-device System Settings Menu."
            },
            {
                    "AccessManagerSettings Reduced",
                    "AccessManager",
                    Profiles.AccessManagerSettingsReduced,
                    "Select the level of system settings access to be allowed on the device's System Settings menu\n\nThis value will cause the device user to be allowed to access only a reduced set of the capabilities of the in-device System Settings Menu (Display, Volume, About)"
            },
            {
                    "AccessManagerSettings No Whitelist",
                    "AccessManager",
                    Profiles.AccessManagerSettingsNoWhitelist,
                    "Select the desired Operation Mode which will turn Whitelisting on or off. Whitelisting is turned off by default, and hence no restrictions are imposed on which applications device users can install or which applications can be launched.\n\nThis value will cause Whitelisting to be turned off and hence disable all Whitelisting functionality."
            },
            {
                    "AppManager QuickSearchBox Enable",
                    "ApplicationManager",
                    Profiles.ApplicationManagerQuickSearchBoxEnable,
                    "Specify the application action to perform.\n\nEnable Application\n\nEnables the System application with the specified Package Name, thereby allowing it to be launched. If no System application with the specified Package Name is built into the device, an error will be returned in the Result XML document"
            },
            {
                    "AppManager QuickSearchBox Disable",
                    "ApplicationManager",
                    Profiles.ApplicationManagerQuickSearchBoxDisable,
                    "Specify the application action to perform.\n\nDisable Application\n\nDisables the System application with the specified Package Name, thereby preventing it from being launched. If no System application with the specified Package Name is built-into the device, an error will be returned in the Result XML document."
            },
            {
                    "AppManager Settings App Enable",
                    "ApplicationManager",
                    Profiles.ApplicationManagerSettingsAppEnable,
                    "Specify the application action to perform.\n\nEnable Application\n\nEnables the System application with the specified Package Name, thereby allowing it to be launched. If no System application with the specified Package Name is built into the device, an error will be returned in the Result XML document"
            },
            {
                    "AppManager Settings App Disable",
                    "ApplicationManager",
                    Profiles.ApplicationManagerSettingsAppDisable,
                    "Specify the application action to perform.\n\nDisable Application\n\nDisables the System application with the specified Package Name, thereby preventing it from being launched. If no System application with the specified Package Name is built-into the device, an error will be returned in the Result XML document."
            },
            {
                    "AccessToAppInfo Enable",
                    "ApplicationManager",
                    Profiles.AccessToAppInfoEnable,
                    "The parm allows blocking of access to App Info for all applications without blocking access to other parts of the System Settings Menu.\n\nEnables access to App Info of all applications on the device if access to the System Settings Menu application is enabled."
            },
            {
                    "AccessToAppInfo Disable",
                    "ApplicationManager",
                    Profiles.AccessToAppInfoDisable,
                    "The parm allows blocking of access to App Info for all applications without blocking access to other parts of the System Settings Menu.\n\nDisables access access to App Info for all application on the device."
            },
            {
                    "AccessToAppSettings Enable",
                    "SettingsManager",
                    Profiles.AccessAppsSettingsEnable,
                    "Ability to Access Apps Section in Settings UI\n\nThis value will cause the device user to be allowed to access the \"Apps\" section of the System Settings Menu."
            },
            {
                    "AccessToAppSettings Disable",
                    "SettingsManager",
                    Profiles.AccessAppsSettingsDisable,
                    "Ability to Access Apps Section in Settings UI\n\nThis value will cause the device user to be prevented from accessing the \"Apps\" section of the System Settings Menu."
            }
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDescription = (TextView)findViewById(R.id.profileDescription);
        Spinner profileSpinner = (Spinner) findViewById(R.id.spinner);
        profileSpinner.setOnItemSelectedListener(this);
        ArrayList<String> profileNames = new ArrayList<String>();
        for(int i = 0; i < profiles.length; i++)
        {
            profileNames.add(profiles[i][0]);
        }
        ArrayAdapter profileSpinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, profileNames);
        profileSpinnerAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        profileSpinner.setAdapter(profileSpinnerAdapter);
        Button applyProfileButton = (Button)findViewById(R.id.button);
        applyProfileButton.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        applyProfile();
                    }
                }
        );
        //The EMDKManager object will be created and returned in the callback.
        EMDKResults results = EMDKManager.getEMDKManager(getApplicationContext(), this);
        //Check the return status of getEMDKManager
        if (results.statusCode == EMDKResults.STATUS_CODE.SUCCESS) {
            // EMDKManager object creation success
        } else {
            // EMDKManager object creation failed
            showDialog("Error", "Could not create EMDK Manager");
        }
    }

    private void applyProfile() {
        if (selectedProfile > -1)
        {
            if (profileManager != null)
            {
                String[] modifyData = new String[1];
                modifyData[0] = profiles[selectedProfile][PROFILE];
                EMDKResults results = profileManager.processProfile(profiles[selectedProfile][PROFILE_NAME],
                        ProfileManager.PROFILE_FLAG.SET, modifyData);

                if (results.statusCode == EMDKResults.STATUS_CODE.CHECK_XML)
                {
                    //  it worked
                    Toast.makeText(getApplicationContext(), "" + profiles[selectedProfile][PROFILE_NAME_TEXT] + " successfully applied", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    showDialog("Error", "Failed to apply profile" + results.getStatusString());
                }
            }
        }
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        showNotification();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        hideNotification();
    }

    @Override
    public void onOpened(EMDKManager emdkManager) {
        this.emdkManager = emdkManager;
        // Get the ProfileManager object to process the profiles
        profileManager = (ProfileManager) emdkManager
                .getInstance(EMDKManager.FEATURE_TYPE.PROFILE);
    }

    @Override
    public void onClosed() {
        profileManager = null;
    }

    public void showDialog(String title, String message)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message)
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick
                                    (DialogInterface dialog,
                                    int id) {
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void showNotification()
    {
        NotificationCompat.Builder mBuilder =   new NotificationCompat.Builder(this)
            .setSmallIcon(R.mipmap.ic_launcher) // notification icon
            .setContentTitle("Test Notification") // title for notification
            .setContentText("This is a test notification") // message for notification
            .setAutoCancel(true); // clear notification after click
        Intent intent = new Intent(this, MainActivity.class);
        //PendingIntent pi = PendingIntent.getActivity(this,0,intent, Intent.FLAG_ACTIVITY_NEW_TASK);
        PendingIntent pi = PendingIntent.getActivity(this,0,intent, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(pi);
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(0, mBuilder.build());
    }

    public void hideNotification()
    {
        NotificationManager mNotificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.cancel(0);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        txtDescription.setText(profiles[i][PROFILE_DESCRIPTION]);
        selectedProfile = i;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
