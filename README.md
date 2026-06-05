# Custom Keycloak LDAP Mapper that maps Users' Enabled-Status

## Overview

This Keycloak extension implements an additional custom mapper for LDAP user
federations. When mapping LDAP user entries to Keycloak users, a specific LDAP
user attribute can be matched against a specific required value. If the
attribute value of the user matches that value, the user is enabled in
Keycloak, otherwise the user is disabled.

This Keycloak extension has been created for training purposes and is fine-tuned
for use with [the corresponding developer deployment](https://github.com/b1-systems/keycloak-developer-deployment).

## Author, Copyright and License Information

The code in this example is heavily based on Wiktor Nastał's "Keycloak LDAP
Custom Enabled Value Mapper", retrieved from GitHub under the terms and
conditions of the Apache License Version 2.0 (see [LICENSE.txt](LICENSE.txt)
for the text of the license). The URL of the original project is:

* <https://github.com/Nithe14/keycloak-custom-ldap-enabled-mapper/>

Licensed under the Apache License, Version 2.0 (the "License"); you may not use
this file except in compliance with the License. You may obtain a copy of the
License at <http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software distributed
under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.
