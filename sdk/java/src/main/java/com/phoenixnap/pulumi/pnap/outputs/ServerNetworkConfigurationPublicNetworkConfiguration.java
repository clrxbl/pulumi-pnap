// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.phoenixnap.pulumi.pnap.outputs.ServerNetworkConfigurationPublicNetworkConfigurationPublicNetwork;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ServerNetworkConfigurationPublicNetworkConfiguration {
    private @Nullable List<ServerNetworkConfigurationPublicNetworkConfigurationPublicNetwork> publicNetworks;

    private ServerNetworkConfigurationPublicNetworkConfiguration() {}
    public List<ServerNetworkConfigurationPublicNetworkConfigurationPublicNetwork> publicNetworks() {
        return this.publicNetworks == null ? List.of() : this.publicNetworks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerNetworkConfigurationPublicNetworkConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ServerNetworkConfigurationPublicNetworkConfigurationPublicNetwork> publicNetworks;
        public Builder() {}
        public Builder(ServerNetworkConfigurationPublicNetworkConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicNetworks = defaults.publicNetworks;
        }

        @CustomType.Setter
        public Builder publicNetworks(@Nullable List<ServerNetworkConfigurationPublicNetworkConfigurationPublicNetwork> publicNetworks) {

            this.publicNetworks = publicNetworks;
            return this;
        }
        public Builder publicNetworks(ServerNetworkConfigurationPublicNetworkConfigurationPublicNetwork... publicNetworks) {
            return publicNetworks(List.of(publicNetworks));
        }
        public ServerNetworkConfigurationPublicNetworkConfiguration build() {
            final var _resultValue = new ServerNetworkConfigurationPublicNetworkConfiguration();
            _resultValue.publicNetworks = publicNetworks;
            return _resultValue;
        }
    }
}
