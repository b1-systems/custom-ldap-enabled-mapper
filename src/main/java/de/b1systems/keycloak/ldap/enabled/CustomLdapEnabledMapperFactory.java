/* Copyright 2026  B1 Systems GmbH <info@b1-systems.de>
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
 * */

package de.b1systems.keycloak.ldap.enabled;

import java.util.List;

import org.keycloak.component.ComponentModel;
import org.keycloak.provider.ProviderConfigProperty;
import org.keycloak.provider.ProviderConfigurationBuilder;
import org.keycloak.storage.ldap.LDAPStorageProvider;
import org.keycloak.storage.ldap.mappers.AbstractLDAPStorageMapper;
import org.keycloak.storage.ldap.mappers.AbstractLDAPStorageMapperFactory;

public class CustomLdapEnabledMapperFactory extends AbstractLDAPStorageMapperFactory {
    public static final String PROVIDER_ID = "custom-ldap-enabled-mapper";

    @Override
    public String getId() {
        return PROVIDER_ID;
    }

    @Override
    public String getHelpText() {
        return "Map the user model enabled attribute based on the LDAP attribute";
    }

    @Override
    public List<ProviderConfigProperty> getConfigProperties() {
        return ProviderConfigurationBuilder
            .create()
                .property().name(CustomLdapEnabledMapper.LDAP_ATTRIBUTE)
                    .label("LDAP attribute")
                    .helpText("Name of mapped attribute on LDAP object (e.g. 'inetUserStatus').")
                    .type(ProviderConfigProperty.STRING_TYPE)
                    .required(true)
                    .add()
                .property().name(CustomLdapEnabledMapper.ENABLED_VALUE)
                    .label("Enabled value")
                    .helpText("Enabled value from LDAP (e.g. 'active').")
                    .type(ProviderConfigProperty.STRING_TYPE)
                    .required(true)
                    .add()
                .property().name(CustomLdapEnabledMapper.ALWAYS_READ_VALUE_FROM_LDAP)
                    .label("Always Read Value From LDAP")
                    .helpText("If set to ON, LDAP attribute value will always used instead of value from Keycloak DB")
                    .type(ProviderConfigProperty.BOOLEAN_TYPE)
                    .defaultValue("false")
                    .add()
            .build();
    }

    @Override
    protected AbstractLDAPStorageMapper createMapper(ComponentModel mapperModel, LDAPStorageProvider federationProvider) {
        return new CustomLdapEnabledMapper(mapperModel, federationProvider);
    }
}
