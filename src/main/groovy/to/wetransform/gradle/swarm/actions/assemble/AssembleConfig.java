/*
 * Copyright (c) 2017 wetransform GmbH
 * All rights reserved.
 */

package to.wetransform.gradle.swarm.actions.assemble;

import java.util.List;

/**
 * Configuration interface for assemble action.
 *
 * @author Simon Templer
 */
public interface AssembleConfig {

  /**
   * @return the name of the stack
   */
  String getStackName();

  void setStackName(String name);

  /**
   * @return the name of the setup
   */
  String getSetupName();

  void setSetupName(String name);

  /**
   * Get the configured template file.
   *
   * @return the template to assemble
   */
  Object getTemplate();

  /**
   * Set the template file to assemble.
   *
   * @param template the template file, should be a File or String with the file path
   */
  void setTemplate(Object template);

  /**
   * Get the configured configuration files.
   *
   * @return the configuration files
   */
  List<Object> getConfig();

  /**
   * Set the file list of configuration files or configuration maps.
   *
   * @param config the list of configurations, each should be a File or
   *   String with the file path, or an already loaded configuration map
   */
  void setConfig(List<Object> config);

  /**
   * Get the target file.
   *
   * @return the target file
   */
  Object getTarget();

  /**
   * Set the target file to write the assembled content to.
   *
   * @param target the target file, should be a File or String with the file path
   */
  void setTarget(Object target);

}
