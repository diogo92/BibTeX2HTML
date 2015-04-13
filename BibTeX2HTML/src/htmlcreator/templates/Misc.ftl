<#list MiscList as MiscData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${MiscData.citationKey}</li>
			<#if MiscData.author??>
				<li><strong>Author:</strong> ${MiscData.author}</li>
			</#if>
			<#if MiscData.title??>
				<li><strong>Title:</strong> ${MiscData.title}</li>
			</#if>
			<#if MiscData.howpublished??>
				<li><strong>How Published:</strong> ${MiscData.owpublished}</li>
			</#if>
			<#if MiscData.month??>
				<li><strong>Month:</strong> ${MiscData.month}</li>
			</#if>
			<#if MiscData.year??>
				<li><strong>Year:</strong> ${MiscData.year}</li>
			</#if>
			<#if MiscData.note??>
				<li><strong>Note:</strong> ${MiscData.note}</li>
			</#if>
			<#if MiscData.key??>
				<li><strong>Key:</strong> ${MiscData.key}</li>
			</#if>
		</ul>
	</div>
</#list>