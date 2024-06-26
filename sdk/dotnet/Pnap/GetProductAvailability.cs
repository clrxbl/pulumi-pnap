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
    public static class GetProductAvailability
    {
        /// <summary>
        /// Provides a phoenixNAP product availability datasource. This can be used to read product availabilities.
        /// 
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Fetch product availabilities by product category, product codes and locations.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pnap = Pulumi.Pnap;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var query_1 = Pnap.GetProductAvailability.Invoke(new()
        ///     {
        ///         ProductCategories = new[]
        ///         {
        ///             "SERVER",
        ///         },
        ///         ProductCodes = new[]
        ///         {
        ///             "s1.c1.small",
        ///             "s1.c1.medium",
        ///         },
        ///         Locations = new[]
        ///         {
        ///             "PHX",
        ///             "ASH",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["availabilities"] = query_1.Apply(query_1 =&gt; query_1.Apply(getProductAvailabilityResult =&gt; getProductAvailabilityResult.ProductAvailabilities)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProductAvailabilityResult> InvokeAsync(GetProductAvailabilityArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProductAvailabilityResult>("pnap:index/getProductAvailability:getProductAvailability", args ?? new GetProductAvailabilityArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a phoenixNAP product availability datasource. This can be used to read product availabilities.
        /// 
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Fetch product availabilities by product category, product codes and locations.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pnap = Pulumi.Pnap;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var query_1 = Pnap.GetProductAvailability.Invoke(new()
        ///     {
        ///         ProductCategories = new[]
        ///         {
        ///             "SERVER",
        ///         },
        ///         ProductCodes = new[]
        ///         {
        ///             "s1.c1.small",
        ///             "s1.c1.medium",
        ///         },
        ///         Locations = new[]
        ///         {
        ///             "PHX",
        ///             "ASH",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["availabilities"] = query_1.Apply(query_1 =&gt; query_1.Apply(getProductAvailabilityResult =&gt; getProductAvailabilityResult.ProductAvailabilities)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetProductAvailabilityResult> Invoke(GetProductAvailabilityInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProductAvailabilityResult>("pnap:index/getProductAvailability:getProductAvailability", args ?? new GetProductAvailabilityInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProductAvailabilityArgs : global::Pulumi.InvokeArgs
    {
        [Input("locations")]
        private List<string>? _locations;

        /// <summary>
        /// The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
        /// </summary>
        public List<string> Locations
        {
            get => _locations ?? (_locations = new List<string>());
            set => _locations = value;
        }

        /// <summary>
        /// Minimal quantity of product needed. Minimum, maximum and default values might differ for different products. For servers, they are 1, 10 and 1 respectively.
        /// </summary>
        [Input("minQuantity")]
        public double? MinQuantity { get; set; }

        [Input("productCategories")]
        private List<string>? _productCategories;

        /// <summary>
        /// Product category. Currently only `SERVER` category is supported.
        /// </summary>
        public List<string> ProductCategories
        {
            get => _productCategories ?? (_productCategories = new List<string>());
            set => _productCategories = value;
        }

        [Input("productCodes")]
        private List<string>? _productCodes;

        /// <summary>
        /// The code identifying the product. This code has significance across all locations.
        /// </summary>
        public List<string> ProductCodes
        {
            get => _productCodes ?? (_productCodes = new List<string>());
            set => _productCodes = value;
        }

        /// <summary>
        /// Show only locations where product with requested quantity is available or all locations where product is offered. Default value is `true`.
        /// </summary>
        [Input("showOnlyMinQuantityAvailable")]
        public bool? ShowOnlyMinQuantityAvailable { get; set; }

        [Input("solutions")]
        private List<string>? _solutions;

        /// <summary>
        /// Currently only the following value is allowed: `SERVER_RANCHER`.
        /// </summary>
        public List<string> Solutions
        {
            get => _solutions ?? (_solutions = new List<string>());
            set => _solutions = value;
        }

        public GetProductAvailabilityArgs()
        {
        }
        public static new GetProductAvailabilityArgs Empty => new GetProductAvailabilityArgs();
    }

    public sealed class GetProductAvailabilityInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("locations")]
        private InputList<string>? _locations;

        /// <summary>
        /// The location code. Currently the following values are allowed: `PHX`, `ASH`, `NLD`, `SGP`, `CHI`, `SEA` and `AUS`.
        /// </summary>
        public InputList<string> Locations
        {
            get => _locations ?? (_locations = new InputList<string>());
            set => _locations = value;
        }

        /// <summary>
        /// Minimal quantity of product needed. Minimum, maximum and default values might differ for different products. For servers, they are 1, 10 and 1 respectively.
        /// </summary>
        [Input("minQuantity")]
        public Input<double>? MinQuantity { get; set; }

        [Input("productCategories")]
        private InputList<string>? _productCategories;

        /// <summary>
        /// Product category. Currently only `SERVER` category is supported.
        /// </summary>
        public InputList<string> ProductCategories
        {
            get => _productCategories ?? (_productCategories = new InputList<string>());
            set => _productCategories = value;
        }

        [Input("productCodes")]
        private InputList<string>? _productCodes;

        /// <summary>
        /// The code identifying the product. This code has significance across all locations.
        /// </summary>
        public InputList<string> ProductCodes
        {
            get => _productCodes ?? (_productCodes = new InputList<string>());
            set => _productCodes = value;
        }

        /// <summary>
        /// Show only locations where product with requested quantity is available or all locations where product is offered. Default value is `true`.
        /// </summary>
        [Input("showOnlyMinQuantityAvailable")]
        public Input<bool>? ShowOnlyMinQuantityAvailable { get; set; }

        [Input("solutions")]
        private InputList<string>? _solutions;

        /// <summary>
        /// Currently only the following value is allowed: `SERVER_RANCHER`.
        /// </summary>
        public InputList<string> Solutions
        {
            get => _solutions ?? (_solutions = new InputList<string>());
            set => _solutions = value;
        }

        public GetProductAvailabilityInvokeArgs()
        {
        }
        public static new GetProductAvailabilityInvokeArgs Empty => new GetProductAvailabilityInvokeArgs();
    }


    [OutputType]
    public sealed class GetProductAvailabilityResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The code identifying the location.
        /// </summary>
        public readonly ImmutableArray<string> Locations;
        public readonly double? MinQuantity;
        /// <summary>
        /// List of product availabilities.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetProductAvailabilityProductAvailabilityResult> ProductAvailabilities;
        /// <summary>
        /// The product category.
        /// </summary>
        public readonly ImmutableArray<string> ProductCategories;
        /// <summary>
        /// The code identifying the product.
        /// </summary>
        public readonly ImmutableArray<string> ProductCodes;
        public readonly bool? ShowOnlyMinQuantityAvailable;
        public readonly ImmutableArray<string> Solutions;

        [OutputConstructor]
        private GetProductAvailabilityResult(
            string id,

            ImmutableArray<string> locations,

            double? minQuantity,

            ImmutableArray<Outputs.GetProductAvailabilityProductAvailabilityResult> productAvailabilities,

            ImmutableArray<string> productCategories,

            ImmutableArray<string> productCodes,

            bool? showOnlyMinQuantityAvailable,

            ImmutableArray<string> solutions)
        {
            Id = id;
            Locations = locations;
            MinQuantity = minQuantity;
            ProductAvailabilities = productAvailabilities;
            ProductCategories = productCategories;
            ProductCodes = productCodes;
            ShowOnlyMinQuantityAvailable = showOnlyMinQuantityAvailable;
            Solutions = solutions;
        }
    }
}
