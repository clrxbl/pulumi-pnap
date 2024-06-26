// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.phoenixnap.pulumi.pnap.inputs.ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerNetworkConfigurationPublicNetworkConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerNetworkConfigurationPublicNetworkConfigurationArgs Empty = new ServerNetworkConfigurationPublicNetworkConfigurationArgs();

    @Import(name="publicNetworks")
    private @Nullable Output<List<ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkArgs>> publicNetworks;

    public Optional<Output<List<ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkArgs>>> publicNetworks() {
        return Optional.ofNullable(this.publicNetworks);
    }

    private ServerNetworkConfigurationPublicNetworkConfigurationArgs() {}

    private ServerNetworkConfigurationPublicNetworkConfigurationArgs(ServerNetworkConfigurationPublicNetworkConfigurationArgs $) {
        this.publicNetworks = $.publicNetworks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerNetworkConfigurationPublicNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerNetworkConfigurationPublicNetworkConfigurationArgs $;

        public Builder() {
            $ = new ServerNetworkConfigurationPublicNetworkConfigurationArgs();
        }

        public Builder(ServerNetworkConfigurationPublicNetworkConfigurationArgs defaults) {
            $ = new ServerNetworkConfigurationPublicNetworkConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder publicNetworks(@Nullable Output<List<ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkArgs>> publicNetworks) {
            $.publicNetworks = publicNetworks;
            return this;
        }

        public Builder publicNetworks(List<ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkArgs> publicNetworks) {
            return publicNetworks(Output.of(publicNetworks));
        }

        public Builder publicNetworks(ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkArgs... publicNetworks) {
            return publicNetworks(List.of(publicNetworks));
        }

        public ServerNetworkConfigurationPublicNetworkConfigurationArgs build() {
            return $;
        }
    }

}
