// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.phoenixnap.pulumi.pnap.outputs.GetServerNetworkConfigurationPublicNetworkConfigurationPublicNetwork;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServerNetworkConfigurationPublicNetworkConfiguration {
    /**
     * @return The list of public networks this server is member of.
     * 
     */
    private List<GetServerNetworkConfigurationPublicNetworkConfigurationPublicNetwork> publicNetworks;

    private GetServerNetworkConfigurationPublicNetworkConfiguration() {}
    /**
     * @return The list of public networks this server is member of.
     * 
     */
    public List<GetServerNetworkConfigurationPublicNetworkConfigurationPublicNetwork> publicNetworks() {
        return this.publicNetworks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerNetworkConfigurationPublicNetworkConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetServerNetworkConfigurationPublicNetworkConfigurationPublicNetwork> publicNetworks;
        public Builder() {}
        public Builder(GetServerNetworkConfigurationPublicNetworkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicNetworks = defaults.publicNetworks;
        }

        @CustomType.Setter
        public Builder publicNetworks(List<GetServerNetworkConfigurationPublicNetworkConfigurationPublicNetwork> publicNetworks) {
            if (publicNetworks == null) {
              throw new MissingRequiredPropertyException("GetServerNetworkConfigurationPublicNetworkConfiguration", "publicNetworks");
            }
            this.publicNetworks = publicNetworks;
            return this;
        }
        public Builder publicNetworks(GetServerNetworkConfigurationPublicNetworkConfigurationPublicNetwork... publicNetworks) {
            return publicNetworks(List.of(publicNetworks));
        }
        public GetServerNetworkConfigurationPublicNetworkConfiguration build() {
            final var _resultValue = new GetServerNetworkConfigurationPublicNetworkConfiguration();
            _resultValue.publicNetworks = publicNetworks;
            return _resultValue;
        }
    }
}