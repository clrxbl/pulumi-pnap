// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerNetrisSoftgateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerNetrisSoftgateArgs Empty = new ServerNetrisSoftgateArgs();

    /**
     * IP address or hostname through which to reach the Netris Controller.
     * 
     */
    @Import(name="controllerAddress")
    private @Nullable Output<String> controllerAddress;

    /**
     * @return IP address or hostname through which to reach the Netris Controller.
     * 
     */
    public Optional<Output<String>> controllerAddress() {
        return Optional.ofNullable(this.controllerAddress);
    }

    /**
     * The authentication key of the Netris Controller to connect to. Required for the softgate agent to be able to interact with the Netris Controller.
     * 
     * The `tags` block has field `tag_assignment`.
     * The `tag_assignment` block has 2 fields:
     * 
     */
    @Import(name="controllerAuthKey")
    private @Nullable Output<String> controllerAuthKey;

    /**
     * @return The authentication key of the Netris Controller to connect to. Required for the softgate agent to be able to interact with the Netris Controller.
     * 
     * The `tags` block has field `tag_assignment`.
     * The `tag_assignment` block has 2 fields:
     * 
     */
    public Optional<Output<String>> controllerAuthKey() {
        return Optional.ofNullable(this.controllerAuthKey);
    }

    /**
     * The version of the Netris Controller to connect to.
     * 
     */
    @Import(name="controllerVersion")
    private @Nullable Output<String> controllerVersion;

    /**
     * @return The version of the Netris Controller to connect to.
     * 
     */
    public Optional<Output<String>> controllerVersion() {
        return Optional.ofNullable(this.controllerVersion);
    }

    /**
     * Host OS on which the Netris Softgate is installed.
     * 
     */
    @Import(name="hostOs")
    private @Nullable Output<String> hostOs;

    /**
     * @return Host OS on which the Netris Softgate is installed.
     * 
     */
    public Optional<Output<String>> hostOs() {
        return Optional.ofNullable(this.hostOs);
    }

    private ServerNetrisSoftgateArgs() {}

    private ServerNetrisSoftgateArgs(ServerNetrisSoftgateArgs $) {
        this.controllerAddress = $.controllerAddress;
        this.controllerAuthKey = $.controllerAuthKey;
        this.controllerVersion = $.controllerVersion;
        this.hostOs = $.hostOs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerNetrisSoftgateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerNetrisSoftgateArgs $;

        public Builder() {
            $ = new ServerNetrisSoftgateArgs();
        }

        public Builder(ServerNetrisSoftgateArgs defaults) {
            $ = new ServerNetrisSoftgateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param controllerAddress IP address or hostname through which to reach the Netris Controller.
         * 
         * @return builder
         * 
         */
        public Builder controllerAddress(@Nullable Output<String> controllerAddress) {
            $.controllerAddress = controllerAddress;
            return this;
        }

        /**
         * @param controllerAddress IP address or hostname through which to reach the Netris Controller.
         * 
         * @return builder
         * 
         */
        public Builder controllerAddress(String controllerAddress) {
            return controllerAddress(Output.of(controllerAddress));
        }

        /**
         * @param controllerAuthKey The authentication key of the Netris Controller to connect to. Required for the softgate agent to be able to interact with the Netris Controller.
         * 
         * The `tags` block has field `tag_assignment`.
         * The `tag_assignment` block has 2 fields:
         * 
         * @return builder
         * 
         */
        public Builder controllerAuthKey(@Nullable Output<String> controllerAuthKey) {
            $.controllerAuthKey = controllerAuthKey;
            return this;
        }

        /**
         * @param controllerAuthKey The authentication key of the Netris Controller to connect to. Required for the softgate agent to be able to interact with the Netris Controller.
         * 
         * The `tags` block has field `tag_assignment`.
         * The `tag_assignment` block has 2 fields:
         * 
         * @return builder
         * 
         */
        public Builder controllerAuthKey(String controllerAuthKey) {
            return controllerAuthKey(Output.of(controllerAuthKey));
        }

        /**
         * @param controllerVersion The version of the Netris Controller to connect to.
         * 
         * @return builder
         * 
         */
        public Builder controllerVersion(@Nullable Output<String> controllerVersion) {
            $.controllerVersion = controllerVersion;
            return this;
        }

        /**
         * @param controllerVersion The version of the Netris Controller to connect to.
         * 
         * @return builder
         * 
         */
        public Builder controllerVersion(String controllerVersion) {
            return controllerVersion(Output.of(controllerVersion));
        }

        /**
         * @param hostOs Host OS on which the Netris Softgate is installed.
         * 
         * @return builder
         * 
         */
        public Builder hostOs(@Nullable Output<String> hostOs) {
            $.hostOs = hostOs;
            return this;
        }

        /**
         * @param hostOs Host OS on which the Netris Softgate is installed.
         * 
         * @return builder
         * 
         */
        public Builder hostOs(String hostOs) {
            return hostOs(Output.of(hostOs));
        }

        public ServerNetrisSoftgateArgs build() {
            return $;
        }
    }

}
