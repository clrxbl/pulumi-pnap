// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.phoenixnap.pulumi.pnap.outputs;

import com.phoenixnap.pulumi.pnap.outputs.RancherClusterConfigurationCertificates;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RancherClusterConfiguration {
    /**
     * @return Define the custom SSL certificates to be used instead of defaults. The `certificates` block has 3 fields.
     * 
     */
    private @Nullable RancherClusterConfigurationCertificates certificates;
    /**
     * @return This maps to rancher&#39;s cluster-domain. Cluster Domain.
     * 
     */
    private @Nullable String clusterDomain;
    /**
     * @return This maps to rancher&#39;s etcd-snapshot-retention. Number of snapshots to retain. Default value is 5.
     * 
     */
    private @Nullable Integer etcdSnapshotRetention;
    /**
     * @return This maps to rancher&#39;s etcd-snapshot-schedule-cron. Snapshot interval time in cron spec.
     * 
     */
    private @Nullable String etcdSnapshotScheduleCron;
    /**
     * @return This maps to rancher&#39;s node-taint. Registering kubelet with set of taints.
     * 
     */
    private @Nullable String nodeTaint;
    /**
     * @return This maps to rancher&#39;s tls-san. Add additional hostname or IP as a Subject Alternative Name in the TLS cert.
     * 
     */
    private @Nullable String tlsSan;
    /**
     * @return Shared secret used to join a server or agent to a cluster.
     * 
     */
    private @Nullable String token;

    private RancherClusterConfiguration() {}
    /**
     * @return Define the custom SSL certificates to be used instead of defaults. The `certificates` block has 3 fields.
     * 
     */
    public Optional<RancherClusterConfigurationCertificates> certificates() {
        return Optional.ofNullable(this.certificates);
    }
    /**
     * @return This maps to rancher&#39;s cluster-domain. Cluster Domain.
     * 
     */
    public Optional<String> clusterDomain() {
        return Optional.ofNullable(this.clusterDomain);
    }
    /**
     * @return This maps to rancher&#39;s etcd-snapshot-retention. Number of snapshots to retain. Default value is 5.
     * 
     */
    public Optional<Integer> etcdSnapshotRetention() {
        return Optional.ofNullable(this.etcdSnapshotRetention);
    }
    /**
     * @return This maps to rancher&#39;s etcd-snapshot-schedule-cron. Snapshot interval time in cron spec.
     * 
     */
    public Optional<String> etcdSnapshotScheduleCron() {
        return Optional.ofNullable(this.etcdSnapshotScheduleCron);
    }
    /**
     * @return This maps to rancher&#39;s node-taint. Registering kubelet with set of taints.
     * 
     */
    public Optional<String> nodeTaint() {
        return Optional.ofNullable(this.nodeTaint);
    }
    /**
     * @return This maps to rancher&#39;s tls-san. Add additional hostname or IP as a Subject Alternative Name in the TLS cert.
     * 
     */
    public Optional<String> tlsSan() {
        return Optional.ofNullable(this.tlsSan);
    }
    /**
     * @return Shared secret used to join a server or agent to a cluster.
     * 
     */
    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RancherClusterConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RancherClusterConfigurationCertificates certificates;
        private @Nullable String clusterDomain;
        private @Nullable Integer etcdSnapshotRetention;
        private @Nullable String etcdSnapshotScheduleCron;
        private @Nullable String nodeTaint;
        private @Nullable String tlsSan;
        private @Nullable String token;
        public Builder() {}
        public Builder(RancherClusterConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.clusterDomain = defaults.clusterDomain;
    	      this.etcdSnapshotRetention = defaults.etcdSnapshotRetention;
    	      this.etcdSnapshotScheduleCron = defaults.etcdSnapshotScheduleCron;
    	      this.nodeTaint = defaults.nodeTaint;
    	      this.tlsSan = defaults.tlsSan;
    	      this.token = defaults.token;
        }

        @CustomType.Setter
        public Builder certificates(@Nullable RancherClusterConfigurationCertificates certificates) {

            this.certificates = certificates;
            return this;
        }
        @CustomType.Setter
        public Builder clusterDomain(@Nullable String clusterDomain) {

            this.clusterDomain = clusterDomain;
            return this;
        }
        @CustomType.Setter
        public Builder etcdSnapshotRetention(@Nullable Integer etcdSnapshotRetention) {

            this.etcdSnapshotRetention = etcdSnapshotRetention;
            return this;
        }
        @CustomType.Setter
        public Builder etcdSnapshotScheduleCron(@Nullable String etcdSnapshotScheduleCron) {

            this.etcdSnapshotScheduleCron = etcdSnapshotScheduleCron;
            return this;
        }
        @CustomType.Setter
        public Builder nodeTaint(@Nullable String nodeTaint) {

            this.nodeTaint = nodeTaint;
            return this;
        }
        @CustomType.Setter
        public Builder tlsSan(@Nullable String tlsSan) {

            this.tlsSan = tlsSan;
            return this;
        }
        @CustomType.Setter
        public Builder token(@Nullable String token) {

            this.token = token;
            return this;
        }
        public RancherClusterConfiguration build() {
            final var _resultValue = new RancherClusterConfiguration();
            _resultValue.certificates = certificates;
            _resultValue.clusterDomain = clusterDomain;
            _resultValue.etcdSnapshotRetention = etcdSnapshotRetention;
            _resultValue.etcdSnapshotScheduleCron = etcdSnapshotScheduleCron;
            _resultValue.nodeTaint = nodeTaint;
            _resultValue.tlsSan = tlsSan;
            _resultValue.token = token;
            return _resultValue;
        }
    }
}