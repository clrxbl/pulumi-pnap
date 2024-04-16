// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerNetrisControllerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerNetrisControllerArgs Empty = new ServerNetrisControllerArgs();

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

    /**
     * Auto-generated password set for user &#39;netris&#39; in the web console.
     * 
     */
    @Import(name="netrisUserPassword")
    private @Nullable Output<String> netrisUserPassword;

    /**
     * @return Auto-generated password set for user &#39;netris&#39; in the web console.
     * 
     */
    public Optional<Output<String>> netrisUserPassword() {
        return Optional.ofNullable(this.netrisUserPassword);
    }

    /**
     * The URL for the Netris Controller web console.
     * 
     */
    @Import(name="netrisWebConsoleUrl")
    private @Nullable Output<String> netrisWebConsoleUrl;

    /**
     * @return The URL for the Netris Controller web console.
     * 
     */
    public Optional<Output<String>> netrisWebConsoleUrl() {
        return Optional.ofNullable(this.netrisWebConsoleUrl);
    }

    private ServerNetrisControllerArgs() {}

    private ServerNetrisControllerArgs(ServerNetrisControllerArgs $) {
        this.hostOs = $.hostOs;
        this.netrisUserPassword = $.netrisUserPassword;
        this.netrisWebConsoleUrl = $.netrisWebConsoleUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerNetrisControllerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerNetrisControllerArgs $;

        public Builder() {
            $ = new ServerNetrisControllerArgs();
        }

        public Builder(ServerNetrisControllerArgs defaults) {
            $ = new ServerNetrisControllerArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param netrisUserPassword Auto-generated password set for user &#39;netris&#39; in the web console.
         * 
         * @return builder
         * 
         */
        public Builder netrisUserPassword(@Nullable Output<String> netrisUserPassword) {
            $.netrisUserPassword = netrisUserPassword;
            return this;
        }

        /**
         * @param netrisUserPassword Auto-generated password set for user &#39;netris&#39; in the web console.
         * 
         * @return builder
         * 
         */
        public Builder netrisUserPassword(String netrisUserPassword) {
            return netrisUserPassword(Output.of(netrisUserPassword));
        }

        /**
         * @param netrisWebConsoleUrl The URL for the Netris Controller web console.
         * 
         * @return builder
         * 
         */
        public Builder netrisWebConsoleUrl(@Nullable Output<String> netrisWebConsoleUrl) {
            $.netrisWebConsoleUrl = netrisWebConsoleUrl;
            return this;
        }

        /**
         * @param netrisWebConsoleUrl The URL for the Netris Controller web console.
         * 
         * @return builder
         * 
         */
        public Builder netrisWebConsoleUrl(String netrisWebConsoleUrl) {
            return netrisWebConsoleUrl(Output.of(netrisWebConsoleUrl));
        }

        public ServerNetrisControllerArgs build() {
            return $;
        }
    }

}