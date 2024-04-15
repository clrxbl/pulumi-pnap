// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pnap

import (
	"context"
	"reflect"

	"errors"
	"github.com/phoenixnap/pulumi-pnap/sdk/go/pnap/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a phoenixNAP tag resource. This can be used to create, modify, and delete tags.
//
// ## Example Usage
//
// # Create a tag
//
// ```go
// package main
//
// import (
//
//	"github.com/phoenixnap/pulumi-pnap/sdk/go/pnap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := pnap.NewTag(ctx, "tag-1", &pnap.TagArgs{
//				IsBillingTag: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Tag struct {
	pulumi.CustomResourceState

	CreatedBy pulumi.StringOutput `pulumi:"createdBy"`
	// The description of the tag.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether or not to show the tag as part of billing and invoices.
	IsBillingTag pulumi.BoolOutput `pulumi:"isBillingTag"`
	// The unique name of the tag.
	Name                pulumi.StringOutput              `pulumi:"name"`
	ResourceAssignments TagResourceAssignmentArrayOutput `pulumi:"resourceAssignments"`
	// The optional values of the tag..
	Values pulumi.StringArrayOutput `pulumi:"values"`
}

// NewTag registers a new resource with the given unique name, arguments, and options.
func NewTag(ctx *pulumi.Context,
	name string, args *TagArgs, opts ...pulumi.ResourceOption) (*Tag, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IsBillingTag == nil {
		return nil, errors.New("invalid value for required argument 'IsBillingTag'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Tag
	err := ctx.RegisterResource("pnap:index/tag:Tag", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTag gets an existing Tag resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTag(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TagState, opts ...pulumi.ResourceOption) (*Tag, error) {
	var resource Tag
	err := ctx.ReadResource("pnap:index/tag:Tag", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Tag resources.
type tagState struct {
	CreatedBy *string `pulumi:"createdBy"`
	// The description of the tag.
	Description *string `pulumi:"description"`
	// Whether or not to show the tag as part of billing and invoices.
	IsBillingTag *bool `pulumi:"isBillingTag"`
	// The unique name of the tag.
	Name                *string                 `pulumi:"name"`
	ResourceAssignments []TagResourceAssignment `pulumi:"resourceAssignments"`
	// The optional values of the tag..
	Values []string `pulumi:"values"`
}

type TagState struct {
	CreatedBy pulumi.StringPtrInput
	// The description of the tag.
	Description pulumi.StringPtrInput
	// Whether or not to show the tag as part of billing and invoices.
	IsBillingTag pulumi.BoolPtrInput
	// The unique name of the tag.
	Name                pulumi.StringPtrInput
	ResourceAssignments TagResourceAssignmentArrayInput
	// The optional values of the tag..
	Values pulumi.StringArrayInput
}

func (TagState) ElementType() reflect.Type {
	return reflect.TypeOf((*tagState)(nil)).Elem()
}

type tagArgs struct {
	// The description of the tag.
	Description *string `pulumi:"description"`
	// Whether or not to show the tag as part of billing and invoices.
	IsBillingTag bool `pulumi:"isBillingTag"`
	// The unique name of the tag.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Tag resource.
type TagArgs struct {
	// The description of the tag.
	Description pulumi.StringPtrInput
	// Whether or not to show the tag as part of billing and invoices.
	IsBillingTag pulumi.BoolInput
	// The unique name of the tag.
	Name pulumi.StringPtrInput
}

func (TagArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tagArgs)(nil)).Elem()
}

type TagInput interface {
	pulumi.Input

	ToTagOutput() TagOutput
	ToTagOutputWithContext(ctx context.Context) TagOutput
}

func (*Tag) ElementType() reflect.Type {
	return reflect.TypeOf((**Tag)(nil)).Elem()
}

func (i *Tag) ToTagOutput() TagOutput {
	return i.ToTagOutputWithContext(context.Background())
}

func (i *Tag) ToTagOutputWithContext(ctx context.Context) TagOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagOutput)
}

// TagArrayInput is an input type that accepts TagArray and TagArrayOutput values.
// You can construct a concrete instance of `TagArrayInput` via:
//
//	TagArray{ TagArgs{...} }
type TagArrayInput interface {
	pulumi.Input

	ToTagArrayOutput() TagArrayOutput
	ToTagArrayOutputWithContext(context.Context) TagArrayOutput
}

type TagArray []TagInput

func (TagArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tag)(nil)).Elem()
}

func (i TagArray) ToTagArrayOutput() TagArrayOutput {
	return i.ToTagArrayOutputWithContext(context.Background())
}

func (i TagArray) ToTagArrayOutputWithContext(ctx context.Context) TagArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagArrayOutput)
}

// TagMapInput is an input type that accepts TagMap and TagMapOutput values.
// You can construct a concrete instance of `TagMapInput` via:
//
//	TagMap{ "key": TagArgs{...} }
type TagMapInput interface {
	pulumi.Input

	ToTagMapOutput() TagMapOutput
	ToTagMapOutputWithContext(context.Context) TagMapOutput
}

type TagMap map[string]TagInput

func (TagMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tag)(nil)).Elem()
}

func (i TagMap) ToTagMapOutput() TagMapOutput {
	return i.ToTagMapOutputWithContext(context.Background())
}

func (i TagMap) ToTagMapOutputWithContext(ctx context.Context) TagMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagMapOutput)
}

type TagOutput struct{ *pulumi.OutputState }

func (TagOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Tag)(nil)).Elem()
}

func (o TagOutput) ToTagOutput() TagOutput {
	return o
}

func (o TagOutput) ToTagOutputWithContext(ctx context.Context) TagOutput {
	return o
}

func (o TagOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringOutput { return v.CreatedBy }).(pulumi.StringOutput)
}

// The description of the tag.
func (o TagOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Whether or not to show the tag as part of billing and invoices.
func (o TagOutput) IsBillingTag() pulumi.BoolOutput {
	return o.ApplyT(func(v *Tag) pulumi.BoolOutput { return v.IsBillingTag }).(pulumi.BoolOutput)
}

// The unique name of the tag.
func (o TagOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o TagOutput) ResourceAssignments() TagResourceAssignmentArrayOutput {
	return o.ApplyT(func(v *Tag) TagResourceAssignmentArrayOutput { return v.ResourceAssignments }).(TagResourceAssignmentArrayOutput)
}

// The optional values of the tag..
func (o TagOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringArrayOutput { return v.Values }).(pulumi.StringArrayOutput)
}

type TagArrayOutput struct{ *pulumi.OutputState }

func (TagArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tag)(nil)).Elem()
}

func (o TagArrayOutput) ToTagArrayOutput() TagArrayOutput {
	return o
}

func (o TagArrayOutput) ToTagArrayOutputWithContext(ctx context.Context) TagArrayOutput {
	return o
}

func (o TagArrayOutput) Index(i pulumi.IntInput) TagOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Tag {
		return vs[0].([]*Tag)[vs[1].(int)]
	}).(TagOutput)
}

type TagMapOutput struct{ *pulumi.OutputState }

func (TagMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tag)(nil)).Elem()
}

func (o TagMapOutput) ToTagMapOutput() TagMapOutput {
	return o
}

func (o TagMapOutput) ToTagMapOutputWithContext(ctx context.Context) TagMapOutput {
	return o
}

func (o TagMapOutput) MapIndex(k pulumi.StringInput) TagOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Tag {
		return vs[0].(map[string]*Tag)[vs[1].(string)]
	}).(TagOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TagInput)(nil)).Elem(), &Tag{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagArrayInput)(nil)).Elem(), TagArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagMapInput)(nil)).Elem(), TagMap{})
	pulumi.RegisterOutputType(TagOutput{})
	pulumi.RegisterOutputType(TagArrayOutput{})
	pulumi.RegisterOutputType(TagMapOutput{})
}
