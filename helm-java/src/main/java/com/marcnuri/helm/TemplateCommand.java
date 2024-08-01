/*
 * Copyright 2024 Marc Nuri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.marcnuri.helm;

import com.marcnuri.helm.jni.HelmLib;
import com.marcnuri.helm.jni.ListOptions;

import java.nio.file.Path;
import java.util.List;

import static com.marcnuri.helm.Release.parseMultiple;

public class TemplateCommand extends HelmCommand<List<Release>> {

  private boolean all;
  private boolean allNamespaces;
  private boolean deployed;
  private boolean failed;
  private boolean pending;
  private boolean superseded;
  private boolean uninstalled;
  private boolean uninstalling;
  private String namespace;
  private Path kubeConfig;

  public TemplateCommand(HelmLib helmLib) {
    super(helmLib);
  }

}
