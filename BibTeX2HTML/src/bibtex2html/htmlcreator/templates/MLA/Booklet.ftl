<#list BookletList as BookletData>
	<div>
		<#if BookletData.author??>
			${BookletData.author}.
		</#if>
		<em>${BookletData.title}.</em>
		<#if BookletData.address??>
			${BookletData.address}:
		</#if>
		<#if BookletData.howpublished??>
			<em>${BookletData.howpublished},</em>
		</#if>
		<#if BookletData.month??>
			${BookletData.month},
		</#if>
		<#if BookletData.year??>
			${BookletData.year}.
		</#if>
		<#if BookletData.crossref??>
			References: ${BookletData.crossref}
		</#if>
	</div>
</#list>