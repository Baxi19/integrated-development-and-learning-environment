package com.application;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;

/**
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 */
@PWA(name = "Integrated Development and Learning Environment", shortName = "IDLE")
public class AppShell implements AppShellConfigurator {

}
