/*******************************************************************************
 * Copyright (c) 2011 Rüdiger Herrmann and others. All rights reserved.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Rüdiger Herrmann - initial API and implementation
 ******************************************************************************/
package org.eclipse.rap.ui.internal.launch.rwt.tab;

import org.eclipse.debug.ui.*;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.*;


public class RWTLaunchTabGroup extends AbstractLaunchConfigurationTabGroup {

  public void createTabs( ILaunchConfigurationDialog dialog, String mode ) {
    ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
      new RWTMainTab(),
      new ArgumentsTab(),
      new JavaJRETab(),
      new JavaClasspathTab(),
      new SourceLookupTab(),
      new EnvironmentTab(),
      new CommonTab()
    };
    setTabs( tabs );
  }
}
