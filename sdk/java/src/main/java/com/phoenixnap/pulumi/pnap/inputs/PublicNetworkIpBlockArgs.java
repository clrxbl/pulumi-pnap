// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.phoenixnap.pulumi.pnap.inputs.PublicNetworkIpBlockPublicNetworkIpBlockArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PublicNetworkIpBlockArgs extends com.pulumi.resources.ResourceArgs {

    public static final PublicNetworkIpBlockArgs Empty = new PublicNetworkIpBlockArgs();

    /**
     * The assigned IP Block to the public network.
     * 
     */
    @Import(name="publicNetworkIpBlock")
    private @Nullable Output<PublicNetworkIpBlockPublicNetworkIpBlockArgs> publicNetworkIpBlock;

    /**
     * @return The assigned IP Block to the public network.
     * 
     */
    public Optional<Output<PublicNetworkIpBlockPublicNetworkIpBlockArgs>> publicNetworkIpBlock() {
        return Optional.ofNullable(this.publicNetworkIpBlock);
    }

    private PublicNetworkIpBlockArgs() {}

    private PublicNetworkIpBlockArgs(PublicNetworkIpBlockArgs $) {
        this.publicNetworkIpBlock = $.publicNetworkIpBlock;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicNetworkIpBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicNetworkIpBlockArgs $;

        public Builder() {
            $ = new PublicNetworkIpBlockArgs();
        }

        public Builder(PublicNetworkIpBlockArgs defaults) {
            $ = new PublicNetworkIpBlockArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publicNetworkIpBlock The assigned IP Block to the public network.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkIpBlock(@Nullable Output<PublicNetworkIpBlockPublicNetworkIpBlockArgs> publicNetworkIpBlock) {
            $.publicNetworkIpBlock = publicNetworkIpBlock;
            return this;
        }

        /**
         * @param publicNetworkIpBlock The assigned IP Block to the public network.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkIpBlock(PublicNetworkIpBlockPublicNetworkIpBlockArgs publicNetworkIpBlock) {
            return publicNetworkIpBlock(Output.of(publicNetworkIpBlock));
        }

        public PublicNetworkIpBlockArgs build() {
            return $;
        }
    }

}
