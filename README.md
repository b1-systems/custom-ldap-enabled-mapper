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
