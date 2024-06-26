// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace PhoenixNAP.Pulumi.Pnap
{
    public static class GetStorageNetwork
    {
        /// <summary>
        /// Provides a phoenixNAP Storage Network datasource. This can be used to read storage networks.
        /// 
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Fetch a storage network by name and show it's volumes
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pnap = Pulumi.Pnap;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var storage_Network_1 = Pnap.GetStorageNetwork.Invoke(new()
        ///     {
        ///         Name = "Storage-1",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["volumes"] = storage_Network_1.Apply(storage_Network_1 =&gt; storage_Network_1.Apply(getStorageNetworkResult =&gt; getStorageNetworkResult.Volumes)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetStorageNetworkResult> InvokeAsync(GetStorageNetworkArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetStorageNetworkResult>("pnap:index/getStorageNetwork:getStorageNetwork", args ?? new GetStorageNetworkArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a phoenixNAP Storage Network datasource. This can be used to read storage networks.
        /// 
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Fetch a storage network by name and show it's volumes
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pnap = Pulumi.Pnap;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var storage_Network_1 = Pnap.GetStorageNetwork.Invoke(new()
        ///     {
        ///         Name = "Storage-1",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["volumes"] = storage_Network_1.Apply(storage_Network_1 =&gt; storage_Network_1.Apply(getStorageNetworkResult =&gt; getStorageNetworkResult.Volumes)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetStorageNetworkResult> Invoke(GetStorageNetworkInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetStorageNetworkResult>("pnap:index/getStorageNetwork:getStorageNetwork", args ?? new GetStorageNetworkInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStorageNetworkArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The storage network identifier.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The friendly name of this storage network.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetStorageNetworkArgs()
        {
        }
        public static new GetStorageNetworkArgs Empty => new GetStorageNetworkArgs();
    }

    public sealed class GetStorageNetworkInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The storage network identifier.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The friendly name of this storage network.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetStorageNetworkInvokeArgs()
        {
        }
        public static new GetStorageNetworkInvokeArgs Empty => new GetStorageNetworkInvokeArgs();
    }


    [OutputType]
    public sealed class GetStorageNetworkResult
    {
        /// <summary>
        /// Date and time when this volume was created.
        /// </summary>
        public readonly string CreatedOn;
        /// <summary>
        /// Date and time of the initial request for volume deletion.
        /// </summary>
        public readonly string DeleteRequestedOn;
        /// <summary>
        /// Volume description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The unique id of the tag.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// IP of the storage network
        /// </summary>
        public readonly ImmutableArray<string> Ips;
        /// <summary>
        /// The location of this storage network.
        /// * `network_id `- ID of network the storage belongs to.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// The name of the tag.
        /// </summary>
        public readonly string Name;
        public readonly string NetworkId;
        /// <summary>
        /// Volume's status.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Volume for the storage network.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetStorageNetworkVolumeResult> Volumes;

        [OutputConstructor]
        private GetStorageNetworkResult(
            string createdOn,

            string deleteRequestedOn,

            string description,

            string id,

            ImmutableArray<string> ips,

            string location,

            string name,

            string networkId,

            string status,

            ImmutableArray<Outputs.GetStorageNetworkVolumeResult> volumes)
        {
            CreatedOn = createdOn;
            DeleteRequestedOn = deleteRequestedOn;
            Description = description;
            Id = id;
            Ips = ips;
            Location = location;
            Name = name;
            NetworkId = networkId;
            Status = status;
            Volumes = volumes;
        }
    }
}
