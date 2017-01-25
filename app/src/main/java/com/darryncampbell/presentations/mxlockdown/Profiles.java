package com.darryncampbell.presentations.mxlockdown;

/**
 * Created by darry on 24/01/2017.
 */

public class Profiles {
    static String NotificationPullDownEnable = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><!--This is an auto generated document. Changes to this document may cause incorrect behavior.--><wap-provisioningdoc>\n" +
            "  <characteristic type=\"ProfileInfo\">\n" +
            "    <parm name=\"created_wizard_version\" value=\"6.0.4\"/>\n" +
            "  </characteristic>\n" +
            "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"Notification\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-24 16:07:10\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"UiMgr\" version=\"5.2\">\n" +
            "      <parm name=\"emdk_name\" value=\"UiManager\"/>\n" +
            "      <parm name=\"NotificationPullDown\" value=\"1\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>\n" +
            "</wap-provisioningdoc>";

    static String NotificationPullDownDisable = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><!--This is an auto generated document. Changes to this document may cause incorrect behavior.--><wap-provisioningdoc>\n" +
            "  <characteristic type=\"ProfileInfo\">\n" +
            "    <parm name=\"created_wizard_version\" value=\"6.0.4\"/>\n" +
            "  </characteristic>\n" +
            "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"Notification\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-24 16:07:10\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"UiMgr\" version=\"5.2\">\n" +
            "      <parm name=\"emdk_name\" value=\"UiManager\"/>\n" +
            "      <parm name=\"NotificationPullDown\" value=\"2\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>\n" +
            "</wap-provisioningdoc>";

    static String NotificationGearShow = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><!--This is an auto generated document. Changes to this document may cause incorrect behavior.--><wap-provisioningdoc>\n" +
            "  <characteristic type=\"ProfileInfo\">\n" +
            "    <parm name=\"created_wizard_version\" value=\"6.0.4\"/>\n" +
            "  </characteristic>\n" +
            "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"Notification\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-24 16:07:10\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"UiMgr\" version=\"5.2\">\n" +
            "      <parm name=\"emdk_name\" value=\"UiManager\"/>\n" +
            "      <parm name=\"NotificationSettings\" value=\"1\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>\n" +
            "</wap-provisioningdoc>";

    static String NotificationGearHide = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><!--This is an auto generated document. Changes to this document may cause incorrect behavior.--><wap-provisioningdoc>\n" +
            "  <characteristic type=\"ProfileInfo\">\n" +
            "    <parm name=\"created_wizard_version\" value=\"6.0.4\"/>\n" +
            "  </characteristic>\n" +
            "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"Notification\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-24 16:07:10\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"UiMgr\" version=\"5.2\">\n" +
            "      <parm name=\"emdk_name\" value=\"UiManager\"/>\n" +
            "      <parm name=\"NotificationSettings\" value=\"2\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>\n" +
            "</wap-provisioningdoc>";

    static String NotificationQuickSettingsEnabled = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><!--This is an auto generated document. Changes to this document may cause incorrect behavior.--><wap-provisioningdoc>\n" +
            "  <characteristic type=\"ProfileInfo\">\n" +
            "    <parm name=\"created_wizard_version\" value=\"6.0.4\"/>\n" +
            "  </characteristic>\n" +
            "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"Notification\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-24 16:07:10\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"UiMgr\" version=\"5.2\">\n" +
            "      <parm name=\"emdk_name\" value=\"UiManager\"/>\n" +
            "      <parm name=\"QuickSettings\" value=\"1\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>\n" +
            "</wap-provisioningdoc>";

    static String NotificationQuickSettingsDisabled = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><!--This is an auto generated document. Changes to this document may cause incorrect behavior.--><wap-provisioningdoc>\n" +
            "  <characteristic type=\"ProfileInfo\">\n" +
            "    <parm name=\"created_wizard_version\" value=\"6.0.4\"/>\n" +
            "  </characteristic>\n" +
            "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"Notification\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-24 16:07:10\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"UiMgr\" version=\"5.2\">\n" +
            "      <parm name=\"emdk_name\" value=\"UiManager\"/>\n" +
            "      <parm name=\"QuickSettings\" value=\"2\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>\n" +
            "</wap-provisioningdoc>";

    //  Take great care with these, I managed to nearly brick my device by locking myself out once!
    static String AccessManagerSettingsReduced = "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"AccessManager\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-24 16:50:16\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"AccessMgr\" version=\"4.3\">\n" +
            "      <parm name=\"emdk_name\" value=\"RestrictSettings\"/>\n" +
            "      <parm name=\"OperationMode\" value=\"2\"/>\n" +
            "      <parm name=\"SystemSettings\" value=\"2\"/>\n" +
            "      <parm name=\"AddPackagesAction\" value=\"1\"/>\n" +
            "      <parm name=\"AddPackageNames\" value=\"com.darryncampbell.presentations.mxlockdown\"/>\n" +
            "      <parm name=\"AddPackagesActionAllowXML\" value=\"1\"/>\n" +
            "      <parm name=\"AddPackageNamesAllowXML\" value=\"com.darryncampbell.presentations.mxlockdown\"/>\n" +
            "      <parm name=\"AllowSubmitXMLAction\" value=\"2\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>";

    //  Take great care with these, I managed to nearly brick my device by locking myself out once!
    static String AccessManagerSettingsFull = "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"AccessManager\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-24 16:50:16\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"AccessMgr\" version=\"4.3\">\n" +
            "      <parm name=\"emdk_name\" value=\"RestrictSettings\"/>\n" +
            "      <parm name=\"OperationMode\" value=\"2\"/>\n" +
            "      <parm name=\"SystemSettings\" value=\"1\"/>\n" +
            "      <parm name=\"AddPackagesAction\" value=\"1\"/>\n" +
            "      <parm name=\"AddPackageNames\" value=\"com.darryncampbell.presentations.mxlockdown\"/>\n" +
            "      <parm name=\"AddPackagesActionAllowXML\" value=\"1\"/>\n" +
            "      <parm name=\"AddPackageNamesAllowXML\" value=\"com.darryncampbell.presentations.mxlockdown\"/>\n" +
            "      <parm name=\"AllowSubmitXMLAction\" value=\"2\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>";

    static String ApplicationManagerQuickSearchBoxEnable = "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"ApplicationManager\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-25 08:07:34\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"AppMgr\" version=\"5.1\">\n" +
            "      <parm name=\"emdk_name\" value=\"AppManager\"/>\n" +
            "      <parm name=\"Action\" value=\"EnableApplication\"/>\n" +
            "      <parm name=\"Package\" value=\"com.google.android.googlequicksearchbox\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>";

    static String ApplicationManagerQuickSearchBoxDisable = "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"ApplicationManager\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-25 08:07:34\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"AppMgr\" version=\"5.1\">\n" +
            "      <parm name=\"emdk_name\" value=\"AppManager\"/>\n" +
            "      <parm name=\"Action\" value=\"DisableApplication\"/>\n" +
            "      <parm name=\"Package\" value=\"com.google.android.googlequicksearchbox\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>";

    static String AccessToAppInfoEnable = "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"ApplicationManager\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-25 08:14:24\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"AppMgr\" version=\"5.1\">\n" +
            "      <parm name=\"emdk_name\" value=\"AppManager\"/>\n" +
            "      <parm name=\"AccessAppInfoAction\" value=\"EnableAccessAllInfo\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>";

    static String AccessToAppInfoDisable = "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"ApplicationManager\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-25 08:14:24\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"AppMgr\" version=\"5.1\">\n" +
            "      <parm name=\"emdk_name\" value=\"AppManager\"/>\n" +
            "      <parm name=\"AccessAppInfoAction\" value=\"DisableAccessAllInfo\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>";

    static String AccessAppsSettingsEnable = "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"SettingsManager\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-25 08:20:27\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"SettingsMgr\" version=\"4.4\">\n" +
            "      <parm name=\"emdk_name\" value=\"RestrictSettings\"/>\n" +
            "      <parm name=\"AccessAppsSection\" value=\"1\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>";

    static String AccessAppsSettingsDisable = "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"SettingsManager\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-25 08:20:27\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"SettingsMgr\" version=\"4.4\">\n" +
            "      <parm name=\"emdk_name\" value=\"RestrictSettings\"/>\n" +
            "      <parm name=\"AccessAppsSection\" value=\"2\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>";

    static String ClipboardEnable = "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"Notification\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-25 09:54:57\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"UiMgr\" version=\"5.2\">\n" +
            "      <parm name=\"emdk_name\" value=\"UiManager\"/>\n" +
            "      <parm name=\"ClipBoardUsage\" value=\"1\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>";

    static String ClipboardDisable = "  <characteristic type=\"Profile\">\n" +
            "    <parm name=\"ProfileName\" value=\"Notification\"/>\n" +
            "    <parm name=\"ModifiedDate\" value=\"2017-01-25 09:53:39\"/>\n" +
            "    <parm name=\"TargetSystemVersion\" value=\"6.0\"/>\n" +
            "    <characteristic type=\"UiMgr\" version=\"5.2\">\n" +
            "      <parm name=\"emdk_name\" value=\"UiManager\"/>\n" +
            "      <parm name=\"ClipBoardUsage\" value=\"2\"/>\n" +
            "      <parm name=\"ClipBoardClear\" value=\"true\"/>\n" +
            "    </characteristic>\n" +
            "  </characteristic>";
}
